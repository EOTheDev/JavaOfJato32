package model;

import java.util.ArrayList;

public class Libreria {

	
	private ArrayList<Scaffale> scaffali;

	public Libreria() {
		this.setScaffali(new ArrayList<Scaffale>());
	}

	public ArrayList<Scaffale> getScaffali() {
		return scaffali;
	}

	public void setScaffali(ArrayList<Scaffale> scaffali) {
		this.scaffali = scaffali;
	}

	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Libreria:\n");
		for (Scaffale scaff : scaffali) {
			sb.append(scaff.toString()+"\n");
		}
		
		
		
		return sb.toString();
	}
}
