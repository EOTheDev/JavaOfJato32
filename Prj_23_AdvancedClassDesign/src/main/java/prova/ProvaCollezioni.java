package prova;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProvaCollezioni {

	List<String> spesa=new ArrayList<String>(); //ArrayList -> List
	Set<String> spesaFiltrata=new HashSet<String>(); //HashSet -> Set set (no duplicati) non ordinato
	TreeSet<String> spesaOrdinata=new TreeSet<String>(); //set (no duplicati) ordinato (comparable)
	
	public static void main(String[] args) {
		ProvaCollezioni pc=new ProvaCollezioni();
		pc.spesa.add("Latte");
		pc.spesa.add("Pane");
		pc.spesa.add("Biscotti");
		pc.spesa.add("Olio");
		pc.spesa.add("Zuppa");
		System.out.println(pc.spesa.size());
		
	}
	
}
