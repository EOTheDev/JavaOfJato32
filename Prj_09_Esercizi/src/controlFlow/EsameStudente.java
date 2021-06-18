package controlFlow;

public class EsameStudente {

	public static void main(String[] args) {

		// 1.17. EsercizioScrivere un programma che calcoli il risultato dell’esame di uno studente.
		//Il programma prenderà in ingresso: Il voto ottenuto nella prova scritta (variabile tra -8 e +8)
		// Il voto ottenuto nella prova pratica(variabile tra 0 e 24)
		//Memorizzati questi dati 
		//procederà al calcolo del risultato finale in trentesimi procedendo come segue:
		//Il risultato finale è la somma dei risultati.
		//se il voto di teoria è minore (o uguale) di zero e la somma dei voti di teoria e pratica è maggiore di 18 lo studente è bocciato.
		//se il voto di teoria è minore (o uguale) di zero e il voto di pratica è minore di 18 il programma lostudente è bocciato
		//se il voto di teoria è maggiore di zero e la somma dei voti di teoria e pratica è minore di 18lo studenteè bocciato.
		//se la somma di teoria e pratica vale 31 o 32 il programma stampa: “congratulazioni: 30 e lode”
		// in tutti gli altri casi lo studente è promosso e viene riportato il voto calcolato.
		
		
		
		
		
		
		
		
		
		// 1.17. EsercizioScrivere un programma che calcoli il risultato dell’esame di uno studente.
		//Il programma prenderà in ingresso: Il voto ottenuto nella prova scritta (variabile tra -8 e +8)
		int scritto=verificoVoto(-8, 8, "teorica");
		// Il voto ottenuto nella prova pratica(variabile tra 0 e 24)
		int pratica=verificoVoto(0, 24, "pratica");;
		//Memorizzati questi dati 
		
		//procederà al calcolo del risultato finale in trentesimi procedendo come segue:
		//Il risultato finale è la somma dei risultati.
		int votoFinale=scritto+pratica;
		boolean promosso=true;
		boolean lode=false;
		//se il voto di teoria è minore (o uguale) di zero e la somma dei voti di teoria e pratica è maggiore di 18 lo studente è bocciato.
		if ((scritto<=0)||(votoFinale<18)||(pratica<18)) {
			promosso=false;
		/*} else if ((scritto<=0)&&(pratica<18)){
			//se il voto di teoria è minore (o uguale) di zero e il voto di pratica è minore di 18 il programma lostudente è bocciato
			promosso=false;
		} else if ((scritto>0)&&(votoFinale<18)){
			//se il voto di teoria è maggiore di zero e la somma dei voti di teoria e pratica è minore di 18lo studenteè bocciato.
			promosso=false;*/
		} else if(votoFinale>=31) {
			//se la somma di teoria e pratica vale 31 o 32 il programma stampa: “congratulazioni: 30 e lode”
			//promosso=true;
			lode=true;
		} /*else {
			// in tutti gli altri casi lo studente è promosso e viene riportato il voto calcolato.
			promosso=true;
		}*/
		
		
		if (promosso) {
			if (lode) {
				System.out.println("Complimenti 30 e lode!");
			} else {
				System.out.println("Complimenti: "+votoFinale+" e camminare");
			}
		} else {
			System.out.println("Mi dispiace: devi tornare al prossimo appello");
		}
		
		
	}

	private static int verificoVoto(int min, int max, String prova) {
		int voto=TuttiPositiviPari.chiedo("Il voto della prova "+prova);
		while (!((voto>=min)&&(voto<=max))) {
			voto=TuttiPositiviPari.chiedo("Il voto della prova "+prova);
		}
		return voto;
	}
}
