package model;

import java.util.Scanner;

public class SommaPari {

	public static void main(String[] args) {
		// TODO  5) SOMMA PARI: creare una classe Pari che chiede quanti numeri inserire;
		/*li genera casualmente (da 1 a 10);
		 *  calcola la somma delle sole POSIZIONI PARI;
		 *   stampa l'array e la somma.
		 *   [Fare due for separati,
		 *    uno per la generazione di numeri, 
		 *    l'altro per la somma].
*/
		
		 //	SOMMA PARI: creare una classe Pari che chiede quanti numeri inserire;
			int lunghezza=chiedi();
			int[] array=new int[lunghezza];
			int somma=0;
			for (int i=0; i<array.length;i++) {
		 // li genera casualmente (da 1 a 10);
				array[i]=generaRandom();
				System.out.print(array[i]+"\t");
			}
		 //  calcola la somma delle sole POSIZIONI PARI;
			for (int j = 0; j < array.length; j+=2) {
				somma+=array[j];
			}
			
		 //   stampa l'array e la somma.
			System.out.println();
			System.out.println(somma);
				
			
		 //   [Fare due for separati,
		 //    uno per la generazione di numeri, 
		 //    l'altro per la somma].
		
		
	}

	private static int generaRandom() {
		
		return 1+(int)(Math.random()*10);
		}

		private static int chiedi() {
			Scanner sc= new Scanner(System.in);
			System.out.println("lungo? ");
			return sc.nextInt();
		}

}
