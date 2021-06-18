package esercizi2;

public class SoloVocali {
	
	public static String soloVcl="";
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String esempio="Viva la pizza Amatriciana";
			esempio.toLowerCase();
			esegui(esempio, esempio.length()-1);
			System.out.println(soloVcl);
		
	}

		private static void esegui(String esempio, int i) {
			if (i>0) {
				esegui(esempio, i-1);
			}
			checkVocale(esempio.charAt(i));
			
			
		}

		public static void checkVocale(char lettera) {
			if (lettera=='a'){
				aggiungiLettera(lettera);
			} else if (lettera=='e') {
				aggiungiLettera(lettera);
			} else if (lettera=='i') {
				aggiungiLettera(lettera);
			} else if (lettera=='o') {
				aggiungiLettera(lettera);
			} else if (lettera=='u') {
				aggiungiLettera(lettera);
			}//altrimenti consonante
		}

		private static void aggiungiLettera(char lettera) {
			soloVcl=soloVcl+lettera;
		}
}

