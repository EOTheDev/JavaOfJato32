package model;

import java.util.ArrayList;

public class ContoCorrente {
	private static int counter=1;
	private int numeroCC;
	private double saldo;
	private ArrayList<Cliente> titolari;
	//movimenti
	private ArrayList<Movimento> movimenti;
	
	
	
	
	
	public ContoCorrente() {
		this.saldo=0.0;
		this.numeroCC=counter++;
		titolari=new ArrayList<>();
		movimenti=new ArrayList<>();
		System.out.println("CCn "+this.getNumeroCC()+" correttamente creato");
	}
	
	public int getNumeroCC() {
		return numeroCC;
	}
	public double getSaldo() {
		return saldo;
	}
	public ArrayList<Cliente> getTitolari() {
		return titolari;
	}
	public ArrayList<Movimento> getMovimenti() {
		return movimenti;
	}

	public void addTitolare(Cliente c) {
		titolari.add(c);
		System.out.println("Nuovo titolare "+c);
		
	}

	public void versamento(double amount) {
		movimenti.add(new Movimento(amount));
		amount=Math.abs(amount);
		saldo+=amount;
	}
	public void prelievo(double amount) {
		movimenti.add(new Movimento(amount));
		amount=Math.abs(amount);
		saldo-=amount;
	}

}
