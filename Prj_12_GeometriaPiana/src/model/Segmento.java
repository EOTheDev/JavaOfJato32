package model;

public class Segmento {
	public Punto getA() {
		return a;
	}



	public void setA(Punto a) {
		this.a = a;
	}



	public Punto getB() {
		return b;
	}



	public void setB(Punto b) {
		this.b = b;
	}



	private Punto a, b;
	
	
	
	public Segmento(Punto a, Punto b) {
		this.a=a;
		this.b=b;
	}
	
	public String toString() {
		return "Segmento=A"+a+"B"+b+"\nlunghezza="+lunghezza();
	}
	public double lunghezza() {
		double d=0;
		d=Math.sqrt(Math.pow((b.getY()-a.getY()), 2 )+Math.pow((b.getX()-a.getX()), 2 ));
		return d;
		
	}
}
