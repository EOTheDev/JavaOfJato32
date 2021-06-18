package controlFlow;

public class Fibonacci {

	public static void main(String[] args) {
		/* Scrivere un programma che stampi i primi 100 elementi della successione di Fibonacci.
		 * 
		 * 
		 * 
		 * 
		 * */
		
		final int NUMERO_STAMPE=100;
		long elementoFibonacci=1;
		long elementoSuccessivo=0;
		for (int i = 0; i < NUMERO_STAMPE; i++) {
			
			System.out.println(elementoSuccessivo);
			long tmp= elementoSuccessivo;
			elementoSuccessivo=elementoSuccessivo+elementoFibonacci;
			elementoFibonacci=tmp;
			
			
		}
		
	}

}
