package model;

import java.util.Scanner;

public class Coppie {

	public static void main(String[] args) {
		/*  3) COPPIE: creare una classe Coppie che chiede quanti numeri inserire;
		 *  chiede poi di inserire tali numeri 
		 *  e verifica se c'è almeno una coppia di numeri uguali.
		 *   Stampa l'esito: sì/no.
		 *   
		 *   
		 *   
		 *   
		 */
		//3) COPPIE: creare una classe Coppie che chiede quanti numeri inserire;
		int[] arrayDiCoppie= new int[Massimo.chiediLunghezzaArray()];
		 // chiede poi di inserire tali numeri 
		inseriscoValori(arrayDiCoppie);
		Massimo.stampaArray(arrayDiCoppie);
		// e verifica se c'è almeno una coppia di numeri uguali.
		//  Stampa l'esito: sì/no.
		System.out.println("Ci sono coppie "+thereAreCouples(arrayDiCoppie));
	}

	public static void inseriscoValori(int[] arrayDiCoppie) {
		for (int i = 0; i < arrayDiCoppie.length; i++) {
			arrayDiCoppie[i]=chiediValore();
		}
		
	}

	private static int chiediValore() {
		int input=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Che valore vuoi inserire? ");
		input=sc.nextInt();
		return input;
	}
	private static boolean thereAreCouples(int[] arrayDiCoppie) {
		for (int j = 0; j < arrayDiCoppie.length; j++) {
			int esempio=arrayDiCoppie[j];
			for (int i = 0; i < arrayDiCoppie.length; i++) {
				if(!(i==j)) {
					if(esempio==arrayDiCoppie[i]) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
