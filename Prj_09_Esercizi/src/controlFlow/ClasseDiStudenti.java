package controlFlow;

import java.util.Scanner;

public class ClasseDiStudenti {

	public static void main(String[] args) {

		//1.13. EsercizioUna classe di 10 studenti ha sostenuto un esame.
		//I voti sono espressi con lettere: 'O' = ottimo(corrispondente al 10), 
		//'B' = buono (8),
		//'S' = sufficiente (6), 
		//'I' = insufficiente (4). 
		//Scrivere un programma checonsenta il calcolo della media aritmetica dei voti di tale esame.
		
			
		//1.13. EsercizioUna classe di 10 studenti ha sostenuto un esame.
		int votoTotClasse=0;
		int numeroStudenti=10;
		for (int i = 0; i <numeroStudenti; i++) {
			char voto=chiedoVoto();
			//I voti sono espressi con lettere: 
			switch(voto) {		
			//'O' = ottimo(corrispondente al 10), 
			case 'O':
				votoTotClasse=votoTotClasse+10;
				break;
				//'B' = buono (8),
			case 'B':
				votoTotClasse=votoTotClasse+8;
				break;
				//'S' = sufficiente (6), 
			case 'S':
				votoTotClasse=votoTotClasse+6;
				break;
				//'I' = insufficiente (4). 
			case 'I':
				votoTotClasse=votoTotClasse+4;
				break;
			default:
				System.out.println("Voto non ammesso");
				voto=chiedoVoto();
			}
		}
				//Scrivere un programma checonsenta il calcolo della media aritmetica dei voti di tale esame.
		System.out.println("La media è di "+(votoTotClasse/numeroStudenti));
	}

	private static char chiedoVoto() {
		Scanner sc=new Scanner(System.in);
		System.out.println("che voto ha preso?");		
		return sc.next().charAt(0);
	}

}
