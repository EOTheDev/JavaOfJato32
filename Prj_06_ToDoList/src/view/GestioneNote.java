package view;

import java.util.Scanner;

import controller.Pagina;
import controller.Taccuino;

public class GestioneNote {

	static String[] voci = {"1) aggiungi pagina",
			"2) stampa pagina", "3) aggiungi nota", "4) completa nota", "5) stampa nota", "0) esci"};
	static Taccuino t=new Taccuino();
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		menu();
		int scelta = sc.nextInt();
		boolean gira = true;
		
		while(gira) {
			switch (scelta) {
			case 1:
				//aggiungi pagina
				System.out.println("scelta n "+scelta);
				System.out.println("Aggiungi la pagina numero...");
				int pNum=sc.nextInt();
				t.addPagina(pNum, new Pagina());	
				break;
			case 2:
				//stampa pagina
				System.out.println("scelta n "+scelta);
				System.out.println("Stampo la pagina numero... inserisci");
				int pNum1=sc.nextInt();
				System.out.println(t.getPagina(pNum1).stampaPagina());	
				break;				
			case 3:
				//aggiungi nota
				System.out.println("scelta n "+scelta);
				System.out.println("Aggiungo la nota in pagina numero...");
				int pNum2=sc.nextInt();
				System.out.println("Aggiungi la descrizione della nota...");
				String desc=sc.next();
				sc.nextLine();
				System.out.println("Aggiungo la nota in posizione numero...");
				int pNota=sc.nextInt();
				t.getPagina(pNum2).addNota(pNota, desc);;	
				break;					
			case 4:
				//completa nota
				System.out.println("scelta n "+scelta);
				break;					
			case 5:
				//stampa nota
				System.out.println("scelta n "+scelta);
				break;					
			case 0:
				//esci
				System.out.println("scelta n "+scelta);
				gira = false;
				break;					
				
			
			default:
				System.out.println("scelta n "+scelta+" non disponibile");
				menu();
				scelta = sc.nextInt();
				break;
			}
			menu();
			scelta = sc.nextInt();
			
			
		}
		
		System.out.println("arrivederci");
		
		
		String nota = aggiungiNota(sc);
		
		Pagina p = new Pagina();
		p.addNota(0, nota);
		
		Taccuino tRosso = new Taccuino();
		tRosso.addPagina(0, p);

		String s = tRosso//qui accedo al mio taccuino
						.getPagine()[0]// dal taccuino mi faccio dare la pagina 0
						.getNote()[0]//mi faccio dare la nota 0
								.stampaNota();//stampo la nota corrente
		System.out.println(s);
	}

	private static void menu() {
		for (int i = 0; i < voci.length; i++) {
			System.out.println(voci[i]);
		}
		
	}

	private static String aggiungiNota(Scanner sc) {
		System.out.println("Cosa scrivo nella nota?");
		return sc.nextLine();
	}

}