package tipi;
import java.util.*;

public class Calcolatrice {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		double operando1= sc.nextDouble();
		double operando2= sc.nextDouble();
		String operazione= sc.next();
		
		calcola(operando1, operando2, operazione);
	}

	private static void calcola(double operando1, double operando2, String operazione) {
		if (operazione.equals("+")) {
			System.out.println( operando1+operando2);
		} else if (operazione.equals("*")) {
			System.out.println( operando1*operando2);
		} else if (operazione.equals("/")) {
			System.out.println( operando1/operando2);
		} else if (operazione.equals("-")) {
			System.out.println( operando1-operando2);
		} else {
			System.out.println("errore");
		}
	}
}
