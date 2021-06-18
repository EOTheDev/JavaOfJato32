package model;

public class Quadrato extends Rettangolo{
	
	private Segmento lato;

	
	public Quadrato(Segmento lato) {
		super(lato, lato);
	}
	
	
	
	
	public Segmento getLato() {
		return lato;
	}

	public void setLato(Segmento lato) {
		this.lato = lato;
	}
	
	
	
}
