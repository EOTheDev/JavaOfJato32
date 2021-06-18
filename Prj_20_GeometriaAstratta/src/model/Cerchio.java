package model;

public class Cerchio extends FiguraGeometrica{
private int raggio;





public Cerchio(int raggio) {
	super();
	this.nome= "Cerchio";
	this.contorno="circonferenza";
	this.raggio = raggio;
}
public double perimetro() {
	return Math.round((Math.PI*raggio)*100)/100 ;
}
public double Circonferenza() {
	return perimetro() ;
}



}
