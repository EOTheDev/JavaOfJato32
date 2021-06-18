package view;

import model.Moneta;

public class TheRightChoice {
static int contaTesta=0;
static int contaCroce=0;
static final int LANCI=10000000;
	
	public static void main(String[] args) {
		for (int i=0; i<LANCI; i++) {
			String res= Moneta.lancioMoneta();
				if(res.equals("testa")) {
					contaTesta++;
				} else {
					contaCroce++;
				}
		}
		System.out.println("Numero lanci: "+LANCI);
		System.out.print("Vince ");
		if (contaTesta>contaCroce) {
			System.out.println("testa: "+calcoloPercentuale(contaTesta)+"%");	
		} else {
			System.out.println("croce: "+calcoloPercentuale(contaCroce)+"%");	
		}
		System.out.println("Lanci testa: "+contaTesta);
		System.out.println("Lanci croce: "+contaCroce);
		
		
	}

	private static int calcoloPercentuale(int numero) {
		int percentuale= 100*numero/LANCI;
		return percentuale;
	}
	
}
