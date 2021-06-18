package model;

public class Libro {
	public String libro;
	public Libro(String nome) {
		libro=nome;
	}
	@Override
	public String toString() {
		return "Libro [libro=" + libro + "]";
	}
}
