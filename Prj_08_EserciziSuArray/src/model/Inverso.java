package model;

import java.util.Scanner;

public class Inverso {

	public static void main(String[] args) {
		/*   4) TODO INVERSO: creare una classe Inverso che chiede quanti numeri inserire;
		 *  chiede poi di inserire tali numeri e li salva in un array in ordine inverso nell'array.
		 *  Stampa poi l'array.
		 */
		
		//chiedi la lunghezza array
		int lung=chiedi("Che lunghezza ha l'array? ");
		//salva i numeri al contrario
		int[] array= new int[lung];
		for (int i=array.length-1; i>=0; i--) {
			array[i]=chiedi("Inserisci valore numero ");
		}
		//stampa array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		
		
		
		
		
		// Variante
		 /*  4b VARIANTE: creare una classe InversoCopia che chiede quanti numeri inserire;
		 *  chiede poi di inserire tali numeri e li salva in array a; crea poi un array b 
		 *  e salva i valori di a in esso ma in ordine inverso.
		 *  
		 * 
		 */
		
		//4) INVERSO: creare una classe Inverso che chiede quanti numeri inserire;
		int lunghezza=Massimo.chiediLunghezzaArray();
		int[] arrayInverso=new int[lunghezza];
		//  chiede poi di inserire tali numeri e 
		Coppie.inseriscoValori(arrayInverso);
		//  Stampa poi l'array.
		Massimo.stampaArray(arrayInverso);
		//li salva in un array in ordine inverso nell'array.
		invertoIValori(arrayInverso);
		//  Stampa poi l'array.
		Massimo.stampaArray(arrayInverso);

	}

	private static int chiedi(String testo) {
		Scanner sc= new Scanner(System.in);
		System.out.println(testo);
		return sc.nextInt();
	}

	private static void invertoIValori(int[] arrayInverso) {
		int j=arrayInverso.length-1;
		for(int i=0; i<=arrayInverso.length/2;i++) {
			int tmp=arrayInverso[j];
			arrayInverso[j]=arrayInverso[i];
			arrayInverso[i]=tmp;
			j--;
		}
		
	}

}
