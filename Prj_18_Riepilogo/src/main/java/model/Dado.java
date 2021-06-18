package model;


import java.util.Random;

public class Dado {
	public byte nFacce;
	public String colore;
	
	public Dado() {
		nFacce=6;
		colore="bianco";
	}
	public byte lancia() {
		Random casuale= new Random();
		return (byte)(casuale.nextInt(nFacce)+1);
	
	}
}
