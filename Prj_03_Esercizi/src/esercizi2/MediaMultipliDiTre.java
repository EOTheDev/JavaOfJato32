package esercizi2;

import java.util.Scanner;


public class MediaMultipliDiTre {
	public static int nm3, totMul3;
	public static Scanner tast= new Scanner(System.in);
	
	public static void main(String[] args) {
		int numeriTot;
		System.out.println("quanti numeri vuoi inserire?");
		numeriTot=tast.nextInt();
		esegui(numeriTot);
		System.out.println(totMul3/nm3);
		
	}

	private static void esegui(int numeriTot) {
		if (numeriTot>1) {
			esegui(numeriTot-1);
		} 
		int questoNumero;
		System.out.println("inserisci un numero e premi invio");
		questoNumero=tast.nextInt();
		if (questoNumero%3==0) {
			nm3++;
			totMul3=totMul3+questoNumero;		
		}
		
	}

}
