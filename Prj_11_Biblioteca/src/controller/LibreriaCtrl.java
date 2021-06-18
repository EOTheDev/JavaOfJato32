package controller;

import model.Libreria;
import model.Libro;
import model.Ripiano;
import model.Scaffale;

public class LibreriaCtrl {
	private Libreria libreria;
	
	
	
	public LibreriaCtrl() {
		this.setLibreria(new Libreria());
	}



	public Libreria getLibreria() {
		return libreria;
	}



	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}
	
	public void addLibro(Libro l, Ripiano r) {
		r.getLibri().add(l);
	}
	
	public void addRipiano(int index){
		this.libreria.getScaffali().get(index).getRipiani().add(new Ripiano());		
	}
	
	public void addScaffale(){
		this.libreria.getScaffali().add(new Scaffale());
	}
	public Libro creaLibro(String titolo, int pagine){
		return new Libro(titolo, pagine);
		
	}



	@Override
	public String toString() {
		return "[libreria=" + libreria + "]";
	}



	

}


