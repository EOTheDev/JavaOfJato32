package model;

public class SfondaArray {

	public static void main(String[] args) {
		int[] voti= {23,25,27,29};
		double totale=0;
		try {
			for (int i = 0; i <= voti.length; i++) {
				System.out.println("il voto è "+voti[i]);
				totale+=voti[i];
			}
		} catch (Exception e) {
			System.err.println("Purtroppo si è verificata un'eccezione");
		}
		System.out.println("media "+(totale/voti.length));
	}
	
	
}
