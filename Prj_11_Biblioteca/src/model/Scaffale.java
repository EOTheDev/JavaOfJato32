package model;

import java.util.ArrayList;

public class Scaffale {

	private ArrayList<Ripiano> ripiani;
	
	
	public Scaffale() {
		ripiani= new ArrayList<Ripiano>();
	}

	public ArrayList<Ripiano> getRipiani() {
		return ripiani;
	}

	public void setRipiani(ArrayList<Ripiano> ripiani) {
		this.ripiani = ripiani;
	}
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Scaffale:\n");
		for (Ripiano rip : ripiani) {
			sb.append(rip.toString()+"\n");
		}
		
		
		
		return sb.toString();
	}




}




