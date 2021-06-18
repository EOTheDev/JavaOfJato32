package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ordine {
	private static int contOrdine=1;
	private ArrayList<Pizza> pizze;
	private ArrayList<Bevanda> bevande;
	private int numOrdine;
	private double totOrdine;
	private LocalDateTime dataOrdine;
	
	
	
	
	public ArrayList<Bevanda> getBevande() {
		return bevande;
	}
	public Ordine() {
		this.pizze=new ArrayList<>();
		this.bevande=new ArrayList<>();
		this.totOrdine=0;
		numOrdine=contOrdine++;
		this.dataOrdine= dataOrdine.now();
		
	}

	public ArrayList<Pizza> getPizze() {
		return pizze;
	}

	public int getNumOrdine() {
		return numOrdine;
	}

	public double getTotOrdine() {
		for (Pizza pizza : pizze) {
			totOrdine+=pizza.getPrezzo();
		}
		for (Bevanda bevanda : bevande) {
			totOrdine+=bevanda.getPrezzo();
		}
		return totOrdine;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder("Ordine N.: "+numOrdine+"\n");
		sb.append("Data: "+dataOrdine+"\n");
		for (Pizza pizza : pizze) {
			sb.append(pizza+"\n");
		}
		for (Bevanda bevanda : bevande) {
			sb.append(bevanda+"\n");
		}
		
		sb.append("Totale "+this.getTotOrdine());
		return sb.toString();
	}
	
	
}
