package model;

public class Punto {
	private int x, y;
	
	
	
	public Punto() {
		setX(0);
		setY(0);
		
	}
	public Punto(int asseX, int asseY) {
		setX(asseX);
		setY(asseY);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ");";
	}
	
	
	
	
	
	
}
