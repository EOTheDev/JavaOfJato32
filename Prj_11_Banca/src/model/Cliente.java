package model;

public class Cliente {
private String nome;
private String indirizzo;


public Cliente(String nome, String indirizzo) {
	super();
	this.nome = nome;
	this.indirizzo = indirizzo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getIndirizzo() {
	return indirizzo;
}
public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}




}
