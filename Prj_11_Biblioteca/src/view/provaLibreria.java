package view;

import controller.LibreriaCtrl;
import model.*;

public class provaLibreria {
	public static void main(String[] args) {
		LibreriaCtrl ctrl=new LibreriaCtrl();
		ctrl.addScaffale();//aggiunto scaffale 0
		Scaffale primo=ctrl.getLibreria().getScaffali().get(0); //torna scaffale appena costruito
		ctrl.addRipiano(0); //aggiunto ripiano a scaffale 0
		ctrl.addRipiano(0); //aggiunto ripiano a scaffale 0
		Ripiano r1 = primo.getRipiani().get(0);
		Ripiano r2 = primo.getRipiani().get(1);
		Libro l1=ctrl.creaLibro("Shining", 450);
		Libro l2=ctrl.creaLibro("Cucina Botanica", 560);
		Libro l3=ctrl.creaLibro("Miserabili", 900);
		Libro l4=ctrl.creaLibro("Pamphleto", 250);
		ctrl.addLibro(l1, r1);
		ctrl.addLibro(l3, r1);
		ctrl.addLibro(l2, r2);
		ctrl.addLibro(l4, r2);
		System.out.println(ctrl);
		
		
		
	}
}
