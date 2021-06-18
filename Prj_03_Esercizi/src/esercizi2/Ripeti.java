package esercizi2;

public class Ripeti {

	public static void main(String[] args) {
		String frase="Ciao";
		int ripeto=5;
		ripeti(frase, ripeto);
		

		
	}

	private static void ripeti(String frase, int length) {
		if (length<0) {
			System.out.println("Errore: n negativo");
		} else {
			if (length>1){
				ripeti(frase, length-1);
			}
			System.out.println(frase);
		}
		
	}

}
