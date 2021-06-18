package model;

import java.util.Iterator;
import java.util.Scanner;

public class Crescenti {

	public static void main(String[] args) {
		/*1) CRESCENTI: creare una classe Crescenti che
		 *  chiede quanti numeri inserire; 
		 *  //scanner
		 *  chiede poi di inserire 
		 *  tali numeri e li inserisce in un array.
		 *  //for 
		 *  int[] array =new int[inputUser]
		 *  Controlla in seguito se tali numeri sono in ordine 
		 *  crescente o meno.
		 */
		Scanner tastiera=new Scanner(System.in);
		int numeroCicli = chiedoLungArray(tastiera);
		int[] arrayCrescente=new int[numeroCicli];
		chiedoUtente(tastiera, numeroCicli, arrayCrescente);
		//int[] arrayCrescente= {	5,   9,   64,   321,   4,   18,   11  };
		stampaArray(arrayCrescente);
		boolean riordinati=isRiordinato(arrayCrescente);
		System.out.println("array riordinato "+riordinati);
		riordina(arrayCrescente);
		//int[] arrayOrdinato={1, 2, 3};
		riordinati=isRiordinato(arrayCrescente);
		System.out.println("array riordinato "+riordinati);
		stampaArray(arrayCrescente);
		}

	private static boolean isRiordinato(int[] arrayCrescente) {
		for (int i = 0; i < arrayCrescente.length; i++) {
			if (i+1<arrayCrescente.length) { 
				if (arrayCrescente[i]>arrayCrescente[i+1]) {
					return false;
				}
			}
		}
		return true;
	}

	private static int chiedoLungArray(Scanner tastiera) {
		System.out.println("Quanti numeri vuoi inserire?");
		int numeroCicli=tastiera.nextInt();
		return numeroCicli;
	}

	private static void chiedoUtente(Scanner tastiera, int numeroCicli, int[] arrayCrescente) {
		for (int i = 0; i <numeroCicli; i++) {
		//chiedi utente altri valore array
			System.out.println("quale numero vuoi?");
			arrayCrescente[i]=tastiera.nextInt();
			
		}
	}

	private static void stampaArray(int[] arrayCrescente) {
		for (int i = 0; i < arrayCrescente.length; i++) {
			System.out.print(arrayCrescente[i]+"   ");
		}
		System.out.println();
		
	}

	private static void riordina(int[] arrayCrescente) {
		//dal minore al maggiore
		boolean giroDiControllo=false;
		do {
			giroDiControllo=false;
			for (int i = 0; i < arrayCrescente.length; i++) {
				if (i+1<arrayCrescente.length) {
					 if (arrayCrescente[i]>arrayCrescente[i+1]) {
						int variabileTemporanea=arrayCrescente[i+1];
						arrayCrescente[i+1]=arrayCrescente[i];
						arrayCrescente[i]=variabileTemporanea;
						giroDiControllo=true;
					
					 }	
				}
			}
		} while(giroDiControllo);
	}
}
