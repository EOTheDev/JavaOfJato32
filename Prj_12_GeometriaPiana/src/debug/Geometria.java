package debug;

import model.*;

public class Geometria {
	public static void main(String[] args) {
		Punto a = new Punto();
		Punto b = new Punto(8, 0);
		System.out.println(a.toString()+b);		
		//a.setX(8);
		System.out.println(a.toString()+b);
		Segmento ab= new Segmento(a,b);
		System.out.println(ab);
		Triangolo tri=new Triangolo(a, b, new Punto(15,3));
		System.out.println(tri.perimetro()+"=perimetro\n"+tri.area()+"=area");
		System.out.println(tri);
		Quadrato quad=new Quadrato(ab);
		System.out.println(quad);
		
		
	}
}
