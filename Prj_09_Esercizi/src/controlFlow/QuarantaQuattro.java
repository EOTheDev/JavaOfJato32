package controlFlow;

public class QuarantaQuattro {

	public static void main(String[] args) {
		//1.14. EsercizioScrivere un programma per stampare 44 caratteri (inseriti da tastiera) 
		// in fila per 6 con resto di 2.
		//Suggerimento: la condizione per troncare in file e' if (i % (44 / 6) == 0)
		
		
		
		
	
		//1.14. EsercizioScrivere un programma per stampare 44 caratteri (inseriti da tastiera) 
		char[] ch=new char[44];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=Ripetizioni.chiedoCarattere("Inserisci il carattere");//(char)(10*(Math.random()*26));
		}
		System.out.println();
		for(int i=0; i<44;i++) {
			System.out.print(ch[i]+"\t");
			// in fila per 6 con resto di 2.
			if ((i+1)%(44/6)==0) {
				//Suggerimento: la condizione per troncare in file e' if (i % (44 / 6) == 0)
				System.out.println();
			}
			
		}
		
	}

}
