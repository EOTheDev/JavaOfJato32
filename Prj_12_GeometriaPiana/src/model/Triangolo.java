package model;

public class Triangolo {
	private Punto a,b,c;
	private Segmento ab, bc, ac;
	
	public Triangolo(Punto a, Punto b, Punto c){
		this.a=a;
		this.b=b;
		this.c=c;
		this.ab=new Segmento(a,b);
		this.bc=new Segmento(b,c);
		this.ac=new Segmento(a,c);
		}

	public double perimetro() {
		return ab.lunghezza()+ac.lunghezza()+bc.lunghezza();
	}
	public double area() {
		double semipem=this.perimetro()/2;
		return Math.sqrt(semipem*(semipem-ab.lunghezza())*(semipem-bc.lunghezza())*(semipem-ac.lunghezza()));
		
	}

	@Override
	public String toString() {
		return "Triangolo [\n\tAngoli\n\t\tA" + a + "\n\t\tB" + b + "\n\t\tC" + c + "\n\tLati\n\t\tAB " + ab.lunghezza() + "cm;\n\t\tBC " + bc.lunghezza() + "cm;\n\t\tAC " + ac.lunghezza() + "cm;\n\tPerimetro "+this.perimetro()+"\n\tArea "+this.area();
	}
	


}
