package model;

public abstract class FiguraGeometrica implements Ordinabile{
	private static int counter = 0;
	protected String nome;
	protected String contorno;
	
	
	
	
	
	@Override
	public int compara(FiguraGeometrica fg) {
		if (this.perimetro()-fg.perimetro()==0) {
			return 0;
		} else if (this.perimetro()-fg.perimetro()<0) {
			return -1;
		} else {
			return 1;
		}
	}

	public FiguraGeometrica() {
		counter++;
		this.nome="Forma";
		this.contorno="perimetro";
	}
	 
	public static int getCounter() {
		return counter;
	}
	public abstract double perimetro();
	
	public String toString() {
		return "Data la figura: "+this.nome+" il "+this.contorno+" è di "+perimetro();
	}
	
	
}
