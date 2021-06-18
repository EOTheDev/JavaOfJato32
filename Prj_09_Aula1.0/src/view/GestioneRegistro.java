package view;

import database.DBStudenti;
import model.Registro;

public class GestioneRegistro {

	public static void main(String[] args) {
	//Registro r=new Registro(DBStudenti.studenti);
	Registro r=new Registro(DBStudenti.studenti);
	System.out.println("Elenco: "+r.getStudenti().length);
	r.stampaStudenti(r.getStudenti());
	System.out.println();
	//r.faiAppello();
	System.out.println("Elenco assenti: "+r.getAssenti().length);
	r.stampaStudenti(r.getAssenti());
	System.out.println();
	System.out.println("Elenco presenti: "+r.getPresenti().length);
	r.stampaStudenti(r.getPresenti());
	System.out.println();
	}

}
