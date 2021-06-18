package model.es2;

import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) {
		//chiedere quanti numeri
		int lung=chiedi();
		int[] array= new int[];
		//genera random
		//array boolean true pari els
		//variabili count pari
		
		
		
		
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
