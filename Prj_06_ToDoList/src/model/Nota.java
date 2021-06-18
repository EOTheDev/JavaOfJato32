package model;

public class Nota {
	//stato interno della classe, propriet� comuni a tutte le istanze della classe Nota
		private String descrizione;
		private boolean completa;

		//costruttore
		public Nota(String descrizione) {
			this.descrizione = descrizione;
			this.completa = false;
		}
		//metodo che agisce sulla propriet� completa, dichiarando completata la NOTA
		public void completaNota() {
			this.completa = true;
		}
		//metodo che rappresenta la nota come una stringa, unendo tutte le propriet�
		public String stampaNota() {
			
			String nota = "";
			if (this.completa) {
				nota = nota + "[*]";
			} else {
				nota = nota + "[ ]";
			}
			
			return nota + " " + this.descrizione;
		}
}
