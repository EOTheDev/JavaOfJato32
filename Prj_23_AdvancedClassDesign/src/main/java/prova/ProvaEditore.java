package prova;

import java.util.Set;
import java.util.TreeSet;

import DB.EditoreDAOImpl;
import model.Editore;

public class ProvaEditore {

	public static void main(String[] args) {
		EditoreDAOImpl ed=new EditoreDAOImpl();
		//ed.addEditore(new Editore(0, "Feltrinelli"));
		ed.getAll().forEach(e->System.out.println(e.getNome()));
		Set<String> nomi=new TreeSet<>();
		for (Editore e : ed.getAll()) {
			nomi.add(e.getNome());
		}
		System.out.println("-------------->Editori Ordinati<--------------");
		nomi.forEach(n->System.out.println(n));
	}

}
