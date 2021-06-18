package tipi.interi;
import java.util.Scanner;

public class SecondaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un int");
		int pizza= tastiera.nextInt();
		System.out.println("Inserisci un double");
		double fetta= tastiera.nextDouble();
		String cm = " centimetri";
		System.out.println("La pizza ha un diametro di "+pizza+cm+"\nLa fetta è di "+fetta+cm);
		double formula=pizza/fetta;
		System.out.println("Ci stanno "+formula+" fette di pizza");
		
	}

}
