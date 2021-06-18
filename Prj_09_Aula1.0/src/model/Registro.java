package model;

import java.util.Scanner;

public class Registro {
	private Studente[] studenti;
	public Studente[] getStudenti() {
		return studenti;
	}
	public Studente[] getPresenti() {
		return presenti;
	}
	public Studente[] getAssenti() {
		return assenti;
	}
	private Studente[] presenti;
	private Studente[] assenti;
	
	public Registro(Studente[] studenti) {
		this.studenti=studenti;
		ordineAlfabetico();
		
		this.presenti=new Studente[studenti.length];
		this.assenti=new Studente[studenti.length];
		
	}
	private void ordina() {
		//or
		
	}
	private void ordineAlfabetico() {
//		String[] cognome=new String[studenti.length];
//		String[] nome=new String[studenti.length];
//		for (int i = 0; i < studenti.length; i++) {
//			cognome[i]=studenti[i].getCognome();
//			nome[i]=studenti[i].getNome();	
//		}
		riordino(/*cognome, nome*/);
		
	}
	private void riordino(/*String[] cognome, String[] nome*/) {
		boolean verifico=true;
		//while (verifico) {
		verifico=false;
		System.out.println(verifico);
			for (int i = 0; i < studenti.length; i++) {
				if (i+1<studenti.length) {
					//if (!(studenti[i].getCognome().equalsIgnoreCase(studenti[i+1].getCognome()))) {//se NON hanno lo stesso cognome
						System.out.println(verifico+" nel ciclo for prima di verificare il cognome "+studenti[i].getCognome()+ " con i ="+i);
						verifico = verificoCognomi(/*cognome,*/ verifico, i);
						//System.out.println(verifico+" nel ciclo for dopo aver verificato il cognome "+cognome[i]+ " con i ="+i);
					//} else {
						//System.out.println(verifico+" nel ciclo for con i = "+i);
					//	verifico = verificoCognomi(/*nome,*/ verifico, i);
					//}
				}
			}
		//}
	}
	public boolean verificoCognomi(/*String[] cognome,*/ boolean verifico, int i) {
		
			if(studenti[i].getCognome().length()<studenti[i+1].getCognome().length()) {//cognome i è piu corto
				for (int j = 0; j <studenti[i].getCognome().length(); j++) {
					System.out.println("comparo "+studenti[i].getCognome()+" con "+studenti[i+1].getCognome());
					if (studenti[i].getCognome().charAt(j)>studenti[i+1].getCognome().charAt(j)) {
						//scambio
						System.out.println("comparo "+studenti[i].getCognome().charAt(j)+" con "+studenti[i+1].getCognome().charAt(j));
						
						
						//il problema è che entra sempre qui. perché?
						
						scambio(i);
						//setto verifico true;
						//verifico=true;
						break;
					} 
				}
			} else { //cognome i+1 è piu corto
				for (int j = 0; j <studenti[i+1].getCognome().length(); j++) {
					if (studenti[i].getCognome().charAt(j)>studenti[i+1].getCognome().charAt(j)) {
						//scambio
						scambio(i);
						//setto verifico true;
						verifico=true;
						break;
					} 
				}
			}
		
		return verifico;
	}
	public void scambio(int i) {
		Studente stud = studenti[i];
		studenti[i]=studenti[i+1];
		studenti[i+1]=stud;
	}
	public void faiAppello() {
		Scanner sc=new Scanner(System.in);
		String risposta=null;
		int contAssenti=0;
		int contPresenti=0;
		for (Studente studente : studenti) {
			System.out.println("E' presente lo studente "+studente);
			risposta=sc.next();
			if (risposta.equalsIgnoreCase("no")) {
				this.assenti[trovaPosizioneLibera(assenti)]=studente;
				contAssenti++;
			} else {
				this.presenti[trovaPosizioneLibera(presenti)]=studente;
				contPresenti++;
			}
		}
		assenti=copiaArray(contAssenti, assenti);
		presenti=copiaArray(contPresenti, presenti);
	}
	private Studente[] copiaArray(int contatore, Studente[] elenco) {
		Studente[] nuovoArray=new Studente[contatore];
		for (int i = 0; i < nuovoArray.length; i++) {
			nuovoArray[i]=elenco[i];
		}
		return nuovoArray;
	}
	private int trovaPosizioneLibera(Studente[] assenti) {
			for (int i = 0; i < assenti.length; i++) {
				if (assenti[i]==null) {
					return i;
				}	
			}
			return-1;
			
	}
	public void stampaStudenti(Studente[] studenti) {
		for (Studente studente : studenti) {
			if(studente!=null) {
				System.out.println(studente);
			}
			
		}
	}
}