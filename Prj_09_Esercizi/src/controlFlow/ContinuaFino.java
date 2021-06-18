package controlFlow;

public class ContinuaFino {

	public static void main(String[] args) {
		/*1.9. Esercizio Scrivere un programma ContinuaFino che chiede all’utente di inserire una sequenza di interi.
		 *  Il programma continua a chiedere all’utente di inserire valori fintanto che i valori inseriti soddisfano almeno una delle seguenti condizioni: 
		 *  è negativo e divisibile per 2 è positivo e divisibile per 3 
		 *  Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.
		 *  
           
		/**/

		
		 //	Esercizio Scrivere un programma ContinuaFino che chiede all’utente di inserire una sequenza di interi.
		int input=9;
		int somma= -9;
		while (divDue(input)||divTre(input)) {
			input=TuttiPositiviPari.chiedo("prossimo valore");
			somma=somma+input;
		}
		 // Il programma continua a chiedere all’utente di inserire valori fintanto che i valori inseriti soddisfano almeno una delle seguenti condizioni: 
		 // è negativo e divisibile per 2 è positivo e divisibile per 3 
		 // Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.
		 System.out.println(somma);
		 
		
		
	}

	private static boolean divDue(int input) {
		if ((input<0)&&(input%2==0)) {
			return true;
		}
		return false;
	}

	private static boolean divTre(int input) {
		if ((input>=0)&&(input%3==0)) {
			return true;
		}
		return false;
	}

}
