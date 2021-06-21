package entities;

public class Libro {
	private int pagine;
	private String nome;
	private int idEditore;
	private double prezzo;
	private int idLibro;
	
	
	
	public Libro(int pagine, String nome, int idEditore, double prezzo, int idLibro) {
		this.pagine = pagine;
		this.nome = nome;
		this.idEditore = idEditore;
		this.prezzo = prezzo;
		this.idLibro = idLibro;
	}



	public Libro() {

	}



	@Override
	public String toString() {
		return "Libro [pagine=" + pagine + ", nome=" + nome + ", idEditore=" + idEditore + ", prezzo=" + prezzo
				+ ", idLibro=" + idLibro + "]";
	}



	public int getPagine() {
		return pagine;
	}



	public void setPagine(int pagine) {
		this.pagine = pagine;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdEditore() {
		return idEditore;
	}



	public void setIdEditore(int idEditore) {
		this.idEditore = idEditore;
	}



	public double getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}



	public int getIdLibro() {
		return idLibro;
	}



	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	
	

}
