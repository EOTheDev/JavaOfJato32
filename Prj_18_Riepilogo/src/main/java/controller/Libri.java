package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;

@WebServlet("/libri")
public class Libri extends HttpServlet {
	ArrayList<Libro> libri = new ArrayList<Libro>();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		libri.add("il Signore degli anelli 1");
//		libri.add("il Signore degli anelli 2");
//		libri.add("il Signore degli anelli 3");

//		if (req.getParameter("id") != null) {
//			int id = Integer.parseInt(req.getParameter("id"));
//			resp.getWriter().append(libri.get(id));
//		} else {
			resp.getWriter().append(libri.toString());
//		}

	}// fine do-get

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("titolo")!=null) {
			Libro l = new Libro(req.getParameter("titolo"),10);
			libri.add(l);
		}
		doGet(req, resp);
		//resp.setContentType("text/html");
		//resp.getWriter().append("<a href='/libri'>libri<a>");
		
		
		
	}

	
	
	
}
