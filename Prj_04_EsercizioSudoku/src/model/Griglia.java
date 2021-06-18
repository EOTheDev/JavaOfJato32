package model;

public class Griglia {
private static int righe;
private static int colonne;
private static int contatoreNumDoppi=0;
private static int[][] griglia = {{1,0}};
private static boolean[] valori= {false, false, false,false, false, false,false, false, false};

//public costruisciGriglia(righe, colonne);
	//costruisciGrigliaRandom(righe, colonne);
		//for colonne riempi riga random
	//verificaDoppi() //do while numDoppi
		//contDoppi() 
			//contDoppiRiga() //controlla i doppi di una riga e li sostituisce con 0
				//if doppio 0 nulla else aggiungi a contatore
			//contDoppiColonna //controlla i doppi di una col e sost con 0
				//if doppio 0 nulla else aggiungi a contatore
			//conDoppiQuadrato 
				//if doppio 0 nulla else aggiungi a contatore
		//sostDoppi()
			//valoreDoppiRiga() //sostituisce lo 0 con un num valido e rimuove dal contatore  
			//valoreDoppiColonna()
			//valoreDoppiQuadrato()
	//griglia costruita!! 

//public costruisciGriglia(righe, colonne);
public void costruisciGriglia(int righe, int colonne) {
	setRighe(righe);
	setColonne(colonne);
	//costruisciGrigliaRandom()
	costruisciGrigliaRandom();
	//verificaDoppi() //do while numDoppi
	//do{
	//}while(verificaDoppi());
	boolean verifica=verificaDoppi();
		
	//griglia costruita!! 

}
private boolean verificaDoppi() {
	//contDoppi() 
	contDoppi();
	//sostDoppi()
	sostDoppi();
	//valoreDoppiRiga() //sostituisce lo 0 con un num valido e rimuove dal contatore  
	//valoreDoppiColonna()
	//valoreDoppiQuadrato()
	return false;
}
private void sostDoppi() {
		//valoreDoppiRiga() //sostituisce lo 0 con un num valido e rimuove dal contatore 
		for (int i=0; i<righe;i++) {
			sostDoppiRiga(i);
		}
		//valoreDoppiColonna()
		//valoreDoppiQuadrato()
	
}
private void sostDoppiRiga(int numRiga) {
	for (int i=0; i<colonne;i++) {
		if(!(isNotZero(getValore(i, numRiga)))) {
			int questoValore=generaRandom();
			for (int j=i; j>0; j--) {
				if (!(controlloValorePosizione(questoValore, getValore(j, numRiga)))){
					sostituisciConQuestoValore( questoValore, i, numRiga);
					
				}
				
			}
		azzeraValori();
		}
		
	}
	
}
private void sostituisciConQuestoValore(int questoValore, int i, int numRiga) {
	griglia[numRiga][i]=questoValore;
	
}
private void contDoppi() {
	//contDoppiRiga() //controlla i doppi di una riga e li sostituisce con 0
			//if doppio 0 nulla else aggiungi a contatore
	for (int i=0; i<righe;i++) {
		contDoppiRiga(i);
	}
	//contDoppiColonna //controlla i doppi di una col e sost con 0
			//if doppio 0 nulla else aggiungi a contatore
		//conDoppiQuadrato 
			//if doppio 0 nulla else aggiungi a contatore
	
}
private void contDoppiRiga(int numRiga) {
	for (int i=0; i<colonne;i++) {
		int questoValore=getValore(i, numRiga);
		if(isNotZero(questoValore)) {
			for (int j=i; j>0; j--) {
				if (controlloValorePosizione(questoValore, getValore(j, numRiga))){
					sostituisciConZero(i, numRiga);
					break;
				}
				
			}
		azzeraValori();
		}
		
	}
		

}
private void azzeraValori() {
	for (int i=0; i<valori.length;i++) {
		valori[i]=false;
	}
	
}
private boolean controlloValorePosizione(int questoValore, int valoreRif) {
	if (valori[questoValore-1]) {
		return true;
	}
	if (questoValore==valoreRif) {
		setValoriTrue(questoValore-1);
	}
	return false;
}
private void setValoriTrue(int i) {
	valori[i]=true;
}
private void sostituisciConZero(int colonna, int riga) {//sostituisco con 0 e aggiungo ai numeri doppi
	aggiungiDoppi();
	griglia[riga][colonna]=0;
	
}
private void aggiungiDoppi() {
	// aggiungo ai numeri doppi
	contatoreNumDoppi=contatoreNumDoppi+1;
	
}
private void controlloValoreRiga(int questoValore, int posizione) {
	
	
}
private boolean isNotZero(int questoValore) {
	if (questoValore!=0) {
		return true;
	}
	return false;
}
private void costruisciGrigliaRandom() {
	setGriglia(righe, colonne);
	//for righe riempiRigaRandom
	for(int i=0; i<righe; i++) {
		riempiRigaRandom(i);
	}
}
private void riempiRigaRandom(int riga) {
	// colonne riempio la riga con n random
	for (int i=0; i<colonne; i++) {
		int random =generaRandom();
		griglia[riga][i]=random;
	}
	
}
public int generaRandom() {
	return 1+(int)(9*Math.random());
}
public static void setGriglia(int righe, int colonne) {
	int[][] array= new int[righe][colonne];
	Griglia.griglia= array;
}

public static int getContatoreNumDoppi() {
	return contatoreNumDoppi;
}

public static void addContatoreNumDoppi() {
	Griglia.contatoreNumDoppi = contatoreNumDoppi+1;
}
public static void delContatoreNumDoppi() {
	Griglia.contatoreNumDoppi = contatoreNumDoppi-1;
}

public static int getRighe() {
	return righe;
}
public static void setRighe(int righe) {
	Griglia.righe = righe;
}

public static int getColonne() {
	return colonne;
}
public static void setColonne(int colonne) {
	Griglia.colonne = colonne;
}
public int getValore(int colonne, int righe) {
	return griglia[righe][colonne];
}

}

