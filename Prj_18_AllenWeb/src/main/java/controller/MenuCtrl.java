package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuCtrl
 */
@WebServlet("/menu")
public class MenuCtrl extends HttpServlet {
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ordine0= request.getParameter("alimento0");
		String ordine1= request.getParameter("alimento1");
		String ordine2= request.getParameter("alimento2");

		response.getWriter().append(ordine0+ordine1+ordine2);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
