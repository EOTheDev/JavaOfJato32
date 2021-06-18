package view;

import controller.Risiko;

public class Dandolo {
	
	public static int punteggioDifesa=0;
	public static int punteggioAttacco=0;
	public static final String NOME_GIOCO="Dandolo, Enrico!";
	public static final long CICLI=3000000;
	
	public static void main(String[] args) {
		
		stampaRecord();
		for(int i=0; i<CICLI;i++) {
			init();
		}
		stampaRecord();
	}

	private static void stampaRecord() {
		System.out.println("________________________________________________");
		System.out.println("|\t"+NOME_GIOCO+"\t\t|");
		System.out.println("|\tpunteggio attacco: "+punteggioAttacco+"\t\t|");
		System.out.println("|\tpunteggio difesa: "+punteggioDifesa+"\t\t|");
		System.out.println("|\tpartite giocate: "+CICLI+"\t\t|");
		if(punteggioAttacco+punteggioDifesa>0) {
			stampaPercentuale();
		}
		System.out.println("________________________________________________");
	}

	private static void stampaPercentuale() {
		System.out.println("|\tpercentuale vinte difesa: "+100*punteggioDifesa/(punteggioAttacco+punteggioDifesa)+"%\t|");
	}	

	private static void init() {
		Risiko primoGiro= new Risiko(3,2);
		primoGiro.init();
		//stampaAttacchi(primoGiro);
		//stampaDifesa(primoGiro);
		stampaVittorie(primoGiro);
		
	}

	
	private static void stampaVittorie(Risiko primoGiro) {
		boolean[] arrayDiVittorie=primoGiro.vinceDifesa();
		for (int i=0;i<arrayDiVittorie.length;i++) {
			if (arrayDiVittorie[i]) {
				//System.out.println("Round "+i+" vince la difesa");
				punteggioDifesa++;
			} else {
				//System.out.println("Round "+i+" vince l'attacco");
				punteggioAttacco++;
			}
		}
	}

	private static void stampaDifesa(Risiko risiko) {
		int[] valoreDifesa=risiko.getDefence();
		System.out.print("Difesa: ");
		for (int i=0; i<valoreDifesa.length;i++) {
			System.out.print(valoreDifesa[i]+" ");		
		}
		System.out.println();
	}

	private static void stampaAttacchi(Risiko risiko) {
		int[] valoreAttacchi=risiko.getAttack();
		System.out.print("Attacchi: ");
		for (int i=0; i<valoreAttacchi.length;i++) {
			System.out.print(valoreAttacchi[i]+" ");		
		}
		System.out.println();
	}

}
