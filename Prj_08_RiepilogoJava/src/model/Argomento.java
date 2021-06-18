package model;

public class Argomento {
	//proprietà, attributi, fields
	private String testo;
	
	//metodo costruttore
	public Argomento(String testo) {
		this.setTesto(testo);
	}
	//metodo getter-accessore
	public String getTesto() {
		return testo;
	}
	//metodo setter-mutatore 
	public void setTesto(String testo) {
		this.testo=testo;
	}
}
