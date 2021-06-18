package controller;

import java.util.ArrayList;

import model.*;

public class GestioneDipendenti {
	private ArrayList<Dipendente> dipendenti;
	
	public GestioneDipendenti() {
		this.dipendenti=new ArrayList<Dipendente>();
	}
	public void addDip(Dipendente d) {
		this.dipendenti.add(d);
		System.out.println("Utente aggiunto");
	}
	
	public String viewDipend(int nMat) {
		return dipendenti.get(nMat).toString();
	}
	public ArrayList<String> allDip(){
		
		ArrayList<String> schedario=new ArrayList<String>();
		for (Dipendente dipendente : dipendenti) {
			schedario.add(dipendente.toString());
		}
		return schedario;
	}
	
}
