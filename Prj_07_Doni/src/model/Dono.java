package model;

public class Dono {
private String nomeRegalo;
private double prezzo;

	

public Dono(String nomeRegalo, double prezzo) {
		this.nomeRegalo = nomeRegalo;
		this.prezzo = prezzo;
	}



public double getPrezzo() {
	return prezzo;
}



public String getNomeRegalo() {
	return nomeRegalo;
}
public String toString() {
	return this.getNomeRegalo()+" "+this.getPrezzo();
}




}
