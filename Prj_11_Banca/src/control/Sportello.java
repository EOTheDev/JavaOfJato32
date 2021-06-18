package control;

import java.util.ArrayList;

import model.Cliente;
import model.ContoCorrente;

public class Sportello {
	private String nomeSportello;
	
	
	public Sportello(String nomeSportello) {
		this.nomeSportello=nomeSportello;
	}
	
	//add client db
	public Cliente addCliente(String nomeCliente, String indirizzo) {
		ArrayList<Cliente> clienti=AnagraficaClienti.getClienti();
		Cliente nuovo=new Cliente(nomeCliente, indirizzo);
		clienti.add(nuovo);
		return nuovo;
	}
	//find client
	public Cliente findClienteByName(String nomeCliente) {
		ArrayList<Cliente> clienti= AnagraficaClienti.getClienti();
		for (Cliente cliente : clienti) {
			if(cliente.getNome().equals(nomeCliente)) {
				return cliente;
			}
		}
		return null;
			
	}
	
	
	
	
	
	//apriconto
	//add conto db
	public ContoCorrente apriconto() {
		ContoCorrente cc=new ContoCorrente();
		AnagraficaConti.getConti().add(cc);
		return cc;
	}
	
	//link count to clients
	public void linkContoCliente(ContoCorrente cc, Cliente c) {
		cc.addTitolare(c);
	}
	//close conto
	//findcontobyCliente or by numero
	
	
	//permetto versamento
	public void versamento(ContoCorrente cc, double amount) {
		for (ContoCorrente c : AnagraficaConti.getConti()) {
			if(c.getNumeroCC()==cc.getNumeroCC()) {
				c.versamento(amount);
			}
		}
		
	}
	//permetto prelievo
	public void prelievo(ContoCorrente cc, double amount) {
		for (ContoCorrente c : AnagraficaConti.getConti()) {
			if(c.getNumeroCC()==cc.getNumeroCC()) {
				c.prelievo(amount);
			}
		}
		
	}
	//permetto giroconto
	public void giroconto(ContoCorrente cVersante, ContoCorrente cRicevente, double amount) {
		for (ContoCorrente c : AnagraficaConti.getConti()) {
			if(cVersante.getNumeroCC()==c.getNumeroCC()) {
				c.prelievo(amount);
			}
			if(cRicevente.getNumeroCC()==c.getNumeroCC()) {
				c.versamento(amount);
			}
		}
	}
	//permette richiesta saldo
	public double getSaldo(ContoCorrente c) {
		return c.getSaldo();
	}
		
		
	//stampa estratto conto
	
}
