package esercizi2;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner tast= new Scanner(System.in);
		System.out.println("inserisci un int negativo o positivo");
		int valoreUtente=tast.nextInt();
		System.out.println("inserisci un int negativo o positivo");
		int secondoValoreUtente=tast.nextInt();
		if (valoreUtente<0) {
			if (secondoValoreUtente>=0) {
				printOk();
			} else {
				printNo();
			}
		} else if (valoreUtente>=0) {
			if (secondoValoreUtente<0) {
				printOk();
			} else {
				printNo();
			}
		} else {
			System.out.println("Errore");
		}
		
	}
	
	public static void printOk() {
		System.out.println("OK");
	}
	public static void printNo() {
		System.out.println("NO");
	}

}
