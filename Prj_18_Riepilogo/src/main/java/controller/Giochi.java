package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dado;

@WebServlet("/giochi")
public class Giochi extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//operatore ternario
		response.setContentType("text/html");	
		String g=(request.getParameter("gioco")!=null)?request.getParameter("gioco"):"";
			response.getWriter().append("Benvenuto nella pagina di giochi");
			if (g.equals("dadi")) {
				//giochi?gioco=dadi
				response.getWriter().append("<br>giochiamo a "+g+", va bene?");
				Dado d1=new Dado();
				Dado d2=new Dado();
				int valLancioUno=d1.lancia();
				int valLancioDue=d2.lancia();
				
				response.getWriter().append("<br>Dado rosso "+valLancioUno).append("<br>Dado blu "+valLancioDue);
				if(valLancioUno+valLancioDue>=10) {
					response.getWriter().append("<h1>Hai vinto</h1>");
				} else {
					response.getWriter().append("<h1>Hai perso</h1>");
				}
			}
			if (g.equals("")) {
				response.getWriter().append("<br>Non hai selezionato i giochi");

			}
			
			
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	
}
