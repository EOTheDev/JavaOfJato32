package integration;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import entities.Alimento;
import service.AlimentoService;
import service.AlimentoServiceImpl;

/**
 * Servlet implementation class AlimentiREST
 */
@WebServlet("/api/alimenti")
public class AlimentiREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AlimentoService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlimentiREST() {
        super();
        System.out.println("Servlet costruita");
        this.service= new AlimentoServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hai chiamato via GET");
		System.out.println("vuoi ricevere tutti gli alimenti");
		
		List<Alimento> alimenti= this.service.findAll();
		JSONArray json= new JSONArray();
		for (Alimento a : alimenti) {
			JSONObject obj = new JSONObject();
			obj.put("alimento", a);
			
		}
		
		
		response.getWriter().append(json.toString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
