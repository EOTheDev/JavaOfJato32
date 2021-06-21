package model;

public class Editore implements Comparable<Editore>{
	private int id;
	private String nome;

	
	
	
	
	
	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}






	public Editore() {
		super();
		
	}






	public Editore(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}






	@Override
	public int compareTo(Editore altro) {
		return this.nome.compareTo(altro.nome);
	}




}
