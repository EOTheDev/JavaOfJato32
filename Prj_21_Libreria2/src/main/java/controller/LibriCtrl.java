package controller;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal_DataAccessLayer.LibroDAO;
import model.Libro;

/**
 * Servlet implementation class LibriCtrl
 */
@WebServlet("/librictrl")
public class LibriCtrl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibroDAO ld=new LibroDAO();
		for (Libro l : ld.getLibri()) {
			System.out.println(l.getTitolo());
		}
		
		Collections.sort(ld.getLibri());
		response.getWriter().append("<h1>Sto ragionando</h1>");
		
		for (Libro l : ld.getLibri()) {
			System.out.println(l.getTitolo());
		}
		Comparator<Libro> compLibri= new Comparator<Libro>() {
			@Override
			public int compare(Libro corrente, Libro successivo) {
				
				return (int)(corrente.getPrezzo()-successivo.getPrezzo());
			}
		};
		
		
		
		Collections.sort(ld.getLibri(), compLibri);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
