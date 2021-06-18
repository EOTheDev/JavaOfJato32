package controller;


import model.Dono;

public class DonoCtrl {

	Dono[] doni;
	
	
	public DonoCtrl(){
		this.doni=new Dono[30];
	}
	public void aggiungiDono(String nome, double prezzo) {
		int posLib=trovaPosizioneLibera();
		if (posLib>=0) {
			Dono nuovoDono=new Dono(nome, prezzo);
			doni[posLib]=nuovoDono;
			System.out.println("Dono creato in posizione "+(posLib+1));
		} else {
			System.out.println("Dono non creato, perché lo stack è pieno.");
		}
		
		
	}
	//cerca la posizione libera
	private int trovaPosizioneLibera() {
		for (int i = 0; i < doni.length; i++) {
			if (doni[i]==null) {
				return i;
			}	
		}
		return-1;
	}
	public void stampaDoni() {
		for (Dono dono : doni) {
			if (dono!=null) {
				System.out.println(dono);
			}
		}
			
	}
	public double valoreDoni() {
		double tot=0;
		for (Dono dono : doni) {
			if (dono!=null) {
				tot+=dono.getPrezzo();
			}
		}
		return tot;
	}
}
