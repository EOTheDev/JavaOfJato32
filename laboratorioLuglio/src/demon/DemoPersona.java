package demon;

import controller.PersonaCtrl;
import model.Persona;

public class DemoPersona {
	public static void main(String[] args) {
		PersonaCtrl pc=new PersonaCtrl();
		
		pc.addPersona(new Persona("mauro", 30, true));
		pc.addPersona(new Persona("Gilberto", 29, true));
		pc.addPersona(new Persona("Elena", 28, true));
		pc.addPersona(new Persona("Virgilio", 26, true));
		
		System.out.println(pc.mostraElenco());
		
		pc.getPersone() //java functional programming
		.stream()
		.filter(p -> p.getEta()<28)
		.forEach(p -> System.out.println(p));
		
		
		
		Persona[] people= {
				new Persona("gilberto", 29, false),
				new Persona("Maruro", 29, false),
				new Persona("Giancas", 29, false)
		};
		
		
		for (Persona persona : people) {
			System.out.println(((Persona)object).getNome());
		}
	}
}
