package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal_DataAccessLayer.LibroDAO;
import model.Libro;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/Libri")
public class Libri extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LibroDAO ld;
    
    public Libri() {
        super();
        ld=new LibroDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Libro> libririsultanti=ld.findAll();
//		for (Libro libro : libririsultanti) {
//			System.out.println(libro);
//		} 
		//ld.addLibro(new Libro(200, 1800, 4, "Java: mattone dopo mattone", 600));
//		libririsultanti=ld.findAll();
//		for (Libro libro : libririsultanti) {
//			System.out.println(libro);
//		} 
		//ld.deleteLibro(25);
//		libririsultanti=ld.findAll();
//		for (Libro libro : libririsultanti) {
//			System.out.println(libro);
//		} 
//		Libro l=libririsultanti.get(5);
//		l.setPagine(5555);
//		libririsultanti=ld.findAll();
//		for (Libro libro : libririsultanti) {
//			System.out.println(libro);
//		} 
		request.setAttribute("libri", ld.findAll());
		request.getRequestDispatcher("books.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("titolo"!=null)) {
			String titolo=request.getParameter("titolo");
			double prezzo=Double.parseDouble(request.getParameter("prezzo"));
			int pagine= Integer.parseInt(request.getParameter("pagine"));
			int idEditore= Integer.parseInt(request.getParameter("id_editore"));
			Libro ln= new Libro(3000, pagine, idEditore, titolo, prezzo);
			ld.addLibro(ln);
		}
		doGet(request, response);
		
	}

}
