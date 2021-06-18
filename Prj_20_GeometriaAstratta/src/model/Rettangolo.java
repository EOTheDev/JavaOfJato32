package model;

public class Rettangolo extends FiguraGeometrica{
	private int base;
	private int altezza;
	
	
	public Rettangolo(int base, int altezza) {
		this.altezza =altezza;
		this.base=base;
		this.nome= "Rettangolo";
	}
	
	@Override
	public double perimetro() {
		return (base*2)+(altezza*2);
	}


	
}
