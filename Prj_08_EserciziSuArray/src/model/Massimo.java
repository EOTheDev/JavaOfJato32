package model;

import java.util.Iterator;
import java.util.Scanner;

public class Massimo {

	public static void main(String[] args) {
		/*
		 * 2) MASSIMO: creare una classe Massimo che chiede quanti numeri inserire;
		 *  li genera casualmente; li salva in un'array; stampo l'array;
		 *  trova il massimo e lo stampa indicando anche la sua posizione nell'array.
		 *  
		 *  
		 *  
		 */
		
		
		// 2) MASSIMO: creare una classe Massimo che chiede quanti numeri inserire;
		 int numMassimo=chiediLunghezzaArray();
		  
		 int[] arrayCasuale=new int[numMassimo];
		 //  li genera casualmente; 
		 //  li salva in un'array; 
		 inserisciValoreCasuale(arrayCasuale);
		 //  stampo l'array;
		 stampaArray(arrayCasuale);
		 //  trova il massimo e lo stampa indicando anche la sua posizione nell'array.
		 trovaMax(arrayCasuale);
		   

	}

	public static int chiediLunghezzaArray() {
		int input=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Quanto dev'essere lungo l'array? ");
		input=sc.nextInt();
		return input;
	}

	private static void trovaMax(int[] arrayCasuale) {
		int max=0;
		int pos=0;
		for (int i = 0; i < arrayCasuale.length; i++) {
			if (max<arrayCasuale[i]) {
				max=arrayCasuale[i];
				pos=i;
			}
		}
		System.out.println("Valore max "+max+" in posizione "+(pos+1));
	}

	public static void stampaArray(int[] arrayCasuale) {
		for (int i = 0; i < arrayCasuale.length; i++) {
			System.out.print(arrayCasuale[i]+"\t");
			if((i>0)&&((i+1)%10==0)) {
				System.out.println();	
			}
		}
		System.out.println();
	}

	private static void inserisciValoreCasuale(int[] arrayCasuale) {
		for (int i = 0; i < arrayCasuale.length; i++) {
			arrayCasuale[i]=(int)(1+arrayCasuale.length*Math.random());
		}
		
	}

}
