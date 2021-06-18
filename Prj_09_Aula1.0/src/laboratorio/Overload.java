package laboratorio;

public class Overload {

	public static void main(String[] args) {
		int a=25;
		int b=29;
		int[] voti= {a, b};
		ordina(a, b);
		ordina(voti);

	}

	
	
	
	
	
	
	
	
	
	
	
	private static void ordina(int[] voti) {
		for (int i = 0; i < voti.length; i++) {
			
		}
		
	}




	private static void ordina(int a, int b) {
		if(a<=b) {
			System.out.println("Sono ordinati");
		} else {
			System.out.println("NON sono ordinati");
		}
		
	}

}
