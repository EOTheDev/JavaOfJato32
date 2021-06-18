package view;

import java.util.ArrayList;

import control.Sportello;
import model.Cliente;
import model.ContoCorrente;
import model.Movimento;

public class Banca {

	public static void main(String[] args) {
		Sportello uno=new Sportello("Sportello1");
		Sportello due=new Sportello("Sportello2");
		Cliente attuale=uno.addCliente("Edoardo", "Via del Campo");
		ContoCorrente cc = uno.apriconto();
		uno.linkContoCliente(cc, attuale);
		uno.versamento(cc, 100);
		System.out.println(uno.getSaldo(cc));
		uno.versamento(cc, 100);
		System.out.println(uno.getSaldo(cc));
		uno.versamento(cc, 100);
		System.out.println(uno.getSaldo(cc));
		uno.prelievo(cc, 33.3);

		System.out.println(uno.getSaldo(cc));
		uno.versamento(cc, 100);
		System.out.println(uno.getSaldo(cc));
		uno.prelievo(cc, -25);
		System.out.println(uno.getSaldo(cc));
		
		
		
		
		uno.prelievo(cc, 50);
		System.out.println(uno.getSaldo(cc));
		ArrayList<Movimento> movimenti =cc.getMovimenti();
		for (Movimento movimento : movimenti) {
				System.out.println(movimento.ToString());
		}
		System.out.println(cc.getSaldo());
		
	}

}
