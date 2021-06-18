package controller;

import java.util.Collections;

import model.*;


public class GeoCtrl {
public static void main(String[] args) {
	Contenitore c= new Contenitore();
	c.addFigura(new Rettangolo(13, 6));
	c.addFigura(new Rettangolo(9, 6));
	c.addFigura(new Cerchio(5));
	c.addFigura(new Cerchio(4));
	c.addFigura(new Cerchio(9));
	c.addFigura(new Rettangolo(3, 6));
	c.addFigura(new Cerchio(6));
	c.addFigura(new Rettangolo(70, 15));
	
	Collections.sort(c.getFigure());
	
	for (FiguraGeometrica fg : c.getFigure()) {
			System.out.println(fg);
			System.out.println(fg.perimetro());
	}
}
}
