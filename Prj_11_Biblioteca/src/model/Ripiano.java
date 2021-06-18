package model;

import java.util.ArrayList;

public class Ripiano {
	private ArrayList<Libro> libri;
	
	public Ripiano() {
		this.setLibri(new ArrayList<Libro>());
		
	}

	public ArrayList<Libro> getLibri() {
		return libri;
	}

	public void setLibri(ArrayList<Libro> libri) {
		this.libri = libri;
		
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Ripiano con libri:\n");
		for (Libro libro : libri) {
			sb.append(libro.toString()+"\n");
		}
		
		
		
		return sb.toString();
	}
	
	
	
	
	
	
}
