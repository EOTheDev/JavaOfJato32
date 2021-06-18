package controlFlow;

public class ASCII {

	public static void main(String[] args) {
		
		//1.15. EsercizioScrivere un programma che stampi 10 caratteri (letti da tastiera) ed i relativi codici ASCII.
		
		
		
		
		
		
		
		//1.15. EsercizioScrivere un programma che stampi 10 caratteri
		int numChar=10;
		char[] ch=new char[numChar];
		for (int i = 0; i < numChar; i++) {
			//(letti da tastiera) 
			ch[i]=Ripetizioni.chiedoCarattere("inserisci il char");
		}
		for (int i = 0; i < ch.length; i++) {
			//ed i relativi codici ASCII.
			System.out.println("Char "+ch[i]+"\tcodice int "+(int)(ch[i]));
		}
	}

}
