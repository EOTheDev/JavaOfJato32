package model;

public class Libro implements Comparable<Libro> {
	private int id, pagine, id_editore;
	private String titolo;
	private double prezzo;
	
	
	public Libro() {
		super();
	}


	public Libro(int id, int pagine, int id_editore, String titolo, double prezzo) {
		super();
		this.id = id;
		this.pagine = pagine;
		this.id_editore = id_editore;
		this.titolo = titolo;
		this.prezzo = prezzo;
	}
	
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", pagine=" + pagine + ", id_editore=" + id_editore + ", titolo=" + titolo
				+ ", prezzo=" + prezzo + "]";
	}


	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getId_editore() {
		return id_editore;
	}

	public void setId_editore(int id_editore) {
		this.id_editore = id_editore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


}
