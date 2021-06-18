package view;

import model.Griglia;

public class Sudoku {

	public static void main(String[] args) {
		Griglia sudoku=new Griglia();
		sudoku.costruisciGriglia(9, 9);
		stampaGriglia(sudoku);
	}

	private static void stampaGriglia(Griglia sudoku) {
		for (int i=0; i<sudoku.getColonne();i++) {
			for(int j=0; j<sudoku.getRighe(); j++) {
				System.out.print(sudoku.getValore(i, j)+"\t");
			}
			System.out.println("\t");
		}
		System.out.println("Ci sono: "+sudoku.getContatoreNumDoppi()+" numeri doppi");
		
	}

}
