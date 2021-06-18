package esercizi2;

public class Contrario {
public static String fraseContrario="";

public static void main(String[] args) {
		String frase="viva Java";
		esegui(frase, frase.length());
		System.out.println(frase);
		System.out.println(fraseContrario);

	}

private static void esegui(String frase, int length) {
	if (length>1) {
		esegui(frase, length-1);
	} 
	fraseContrario= frase.charAt(length-1)+fraseContrario;
	
	
}

}
