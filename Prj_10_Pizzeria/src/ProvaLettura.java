import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.Pizza;

public class ProvaLettura {

	public static void main(String[] args) {
		Pizza rossa;
		Scanner sc;
		File f =new File("files/Pizze.txt");
		try {
			
			sc=new Scanner(f);
			String[] riga= sc.next().split(",");
			String nome=riga[0];
			String prezzo=riga[1].;
			rossa=new Pizza(nome, (double) prezzo);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
