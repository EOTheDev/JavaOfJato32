package view;

import controller.OrdineCtrl;

public class Pizzeria {

	public static void main(String[] args) {
		OrdineCtrl oc=new OrdineCtrl();
		oc.nuovoOrdine();
		oc.addPizza("Margherita", 5.99);
		oc.addBevanda("Birra",4.50);
		oc.addPizza("Margherita", 5.99);
		oc.addBevanda("Birra",4.50);
		oc.addPizza("Margherita", 5.99);
		oc.addBevanda("Cochina",50);
		oc.addPizza("Margherita", 5.99);
		oc.addBevanda("Coca",3.00);
		oc.addPizza("Margherita", 5.99);
		oc.addBevanda("Estathe", 3.30);
		oc.addPizza("Margherita", 5.99);
		oc.addBevanda("Coca",3.00);
		oc.addPizza("Margherita", 5.99);
		oc.addBevanda("Estathe", 3.30);
		oc.addPizza("Margherita", 5.99);
		oc.addBevanda("Coca",3.00);
		System.out.println(oc.chiudiOrdine());
	}

}
