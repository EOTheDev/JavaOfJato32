package model;

public class Rettangolo {
	private Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		this.setBase(base);
		this.setAltezza(altezza);
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Rettangolo [\n\tLati\n\t\tAB " + base.lunghezza() + "cm;\n\t\tBC " + altezza.lunghezza() + "cm;\n\tPerimetro "+this.perimetro()+"\n\tArea "+this.area();
	}
	






	public double area() {
		return altezza.lunghezza()*base.lunghezza();
	}
	public double perimetro() {
		return altezza.lunghezza()*2+base.lunghezza()*2;
	}
	
	public Segmento getAltezza() {
		return altezza;
	}

	public void setAltezza(Segmento altezza) {
		this.altezza = altezza;
	}

	public Segmento getBase() {
		return base;
	}

	public void setBase(Segmento base) {
		this.base = base;
	}
	

}
