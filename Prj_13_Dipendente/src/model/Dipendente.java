package model;

public class Dipendente {
	private static int contatore=0;
	protected String nome;
	private String ruolo;
	private int matricola;
	
	public Dipendente(String nome) {
		this.setNome(nome);
	}

	public static int getContatore() {
		return contatore;
	}

	public static void setContatore(int contatore) {
		Dipendente.contatore = contatore;
	}

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("nome: "+this.getNome());
		if(this.getRuolo().isEmpty()) {
			sb.append("\nRuolo da definire;");			
		} else {
			sb.append("\nRuolo: "+this.getRuolo());
		}
		sb.append("\n"+this.getMatricola());
		return sb.toString();
		
	}
	
	
	
}
