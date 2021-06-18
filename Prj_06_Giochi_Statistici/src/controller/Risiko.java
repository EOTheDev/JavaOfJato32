package controller;

import model.Dado;

public class Risiko {
	private int attacco;
	private int difesa;
	private int[] valoreAttacchi;
	private int[] valoreDifesa;
	private Dado dadoRosso= new Dado();
	
	public Risiko(int attacco, int difesa){
		this.attacco=attacco;
		this.difesa=difesa;
	}
	public void init(){
	calcolaAttacco();
	calcolaDifesa();
	riordina();
	}
	
	public boolean[] vinceDifesa() {
		boolean[] arrayDiVittorie=new boolean[difesa];
		for (int i=0; i<difesa;i++) {
			if(valoreAttacchi[i]<=valoreDifesa[i]) {
				arrayDiVittorie[i]=true;
			} else {
				arrayDiVittorie[i]=false;
			}
		}
		return arrayDiVittorie;
	}
	
	
	
	private void riordina() {
		riordina(valoreAttacchi);
		riordina(valoreDifesa);
		
		
		
	}
	private void riordina(int[] array) {
		for (int i=0;i<array.length;i++) {
			riordina(array, i);
		}
		
	
		
		
		
		
		
		
	}
	private void riordina(int[] array, int i) {
		if (i==array.length-1) {
			//finisco ricorsione
		} else {
			if(array[i]<array[i+1]) {
				int tmp=array[i];
				array[i]=array[i+1];
				array[i+1]=tmp;
				}
			riordina(array, i+1);
		}
		
	}
	private void calcolaDifesa() {
		valoreDifesa= new int[difesa];
		for (int i=0; i<difesa;i++) {
			valoreDifesa[i]=dadoRosso.lancia();
		}
		
		
	}
	private void calcolaAttacco() {
		valoreAttacchi= new int[attacco];
		for (int i=0; i<attacco;i++) {
			valoreAttacchi[i]=dadoRosso.lancia();
		}
		
	}
	public int[] getAttack() {
		return valoreAttacchi;
	}
	public int[] getDefence() {
		return valoreDifesa;
	}
	
	
}
