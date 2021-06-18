package control;

import java.util.ArrayList;

import model.Movimento;

public class AnagraficaMovimenti {
	private static ArrayList<Movimento> movimenti=new ArrayList<>();
	
	
	
	
	public static ArrayList<Movimento> getMovimenti(){
			return movimenti;	
	}
	public static void addCliente(Movimento c) {
		movimenti.add(c);
		System.out.println(c+" aggiunto con successo!");
	}
	
	
	
	
	
}
