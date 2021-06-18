package model;

public class Studente {
	private String nome;
	private String cognome;

	public Studente(String nome, String cognome) {
		setNome(nome);
		setCognome(cognome);
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	private void setCognome(String cognome) {
		this.cognome = cognome;
	}

	
	public String toString() {
		return "\t" + nome + ",   \t" +cognome.toUpperCase();
	}
	
	
}
