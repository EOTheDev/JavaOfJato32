package controlFlow;

import java.util.Scanner;

public class TuttiPositiviPari {

	public static void main(String[] args) {
		/* 1.8. EsercizioScrivere un programma TuttiPositiviPari
		 *  che chiede all置tente di inserire una sequenza di interi (chiedendoprima quanti numeri voglia inserire)
		 *  e poi, al termine dell段nserimento dell段ntera sequenza, stampa "Tuttipositivi e pari"
		 *   se i numeri inseriti sono tutti positivi e pari, altrimenti stampa "NO".
		 *   
		 *   
		 *   
		 *   
		 */

		
		
			//(chiedendoprima quanti numeri voglia inserire)
			int lungArray=chiedo("quanti valori?");
			boolean isPari=true;
			// 1.8. EsercizioScrivere un programma TuttiPositiviPari che chiede all置tente di inserire una sequenza di interi 
			int valoreInput=0;
			for (int i=0; i<lungArray; i++) {
				valoreInput=chiedo("che valore vuoi dare?");
					if ((valoreInput%2==1)||(valoreInput<0)) {//se dispari
						isPari=false;
					}
			}
		   	//e poi, al termine dell段nserimento dell段ntera sequenza, 
			//stampa "Tuttipositivi e pari"
			if (isPari) {
				System.out.println("Tuttipositivi e pari");
		  	//  se i numeri inseriti sono tutti positivi e pari, altrimenti stampa "NO".
			} else {
				System.out.println("NO");
			}
				
		
		
		
		
		
		
	}

	public static int chiedo(String richiesta) {
		Scanner tastiera=new Scanner(System.in);
		System.out.println(richiesta);
		return tastiera.nextInt();
	}

}
