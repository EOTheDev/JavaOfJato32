package controlFlow;

import java.util.Scanner;

public class Ripetizioni {

	public static void main(String[] args) {
		//Scrivere un programma Ripetizioni che chiede all’utente di inserire una sequenza di caratteri
		//(chiedendo prima quanti caratteri voglia inserire)
		//e li ristampa man mano che vengono inseriti.
		//L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli)dovrà essere ripetuto 5 volte.
		
		
		
		
		//L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli)dovrà essere ripetuto 5 volte.
		final int RIPETI=5;
		for (int i = 0; i < RIPETI; i++) {
			//Scrivere un programma Ripetizioni che chiede all’utente di inserire una sequenza di caratteri
			//(chiedendo prima quanti caratteri voglia inserire)
			int numChar= TuttiPositiviPari.chiedo("Quanti caratteri vuoi inserire?");
			for(int j=0;j<numChar; j++ ) {
				char input=chiedoCarattere("Che carattere vuoi inserire?");
				//e li ristampa man mano che vengono inseriti.
				System.out.println(input);
			}
		}
		
		
		
		
	}

	public static char chiedoCarattere(String string) {
		Scanner sc=new Scanner(System.in);
		System.out.println(string);
		return sc.next().charAt(0);
	}

}
