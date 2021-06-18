package model;

public class Libro {
	private static int idCounter=0;
	private int id;
	private String titolo;
	private int pagine;
	
	
	/**
	 * Costruttore dell'oggetto libro
	 * @param titolo -passare una stringa come titolo del libro
	 * @param pagine passare un intero come numero di pagine
	 * 
	 */
	
	public Libro(String titolo, int pagine) {
		super();
		this.id=idCounter++;
		this.titolo = titolo;
		this.pagine = pagine;
	}
	
	
	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}



	public int getPagine() {
		return pagine;
	}


	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	
	@Override
	public String toString() {
		return "Libro{'id':'" + id + "', 'titolo':'" + titolo + "', 'pagine':'" + pagine + "'}";
	}
	
	
	
	
}
