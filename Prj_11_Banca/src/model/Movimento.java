package model;

import java.time.LocalDateTime;

public class Movimento {
private LocalDateTime data;
private double operazione;
private String descrizione;


public Movimento(double amount) {
	this.data=LocalDateTime.now();
	if (amount>=0) {
		this.descrizione="Versamento:";
	} else {
		this.descrizione="Prelievo:";
	}
	operazione=amount;
}


public String ToString() {
	return "Movimento\t"+descrizione+"\t€"+operazione;
}


	
}
