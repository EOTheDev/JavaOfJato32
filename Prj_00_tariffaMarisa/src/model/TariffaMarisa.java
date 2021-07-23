package model;

import java.util.Scanner;
public class TariffaMarisa{
    public static int tariffaMarisa=0;
    public static int tariffaVentura=0;   
    public static int tariffaOdierna=0;
    public static Scanner tastiera= new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
       
        System.out.println("La visita continua con un altro professionista?");
        if (checkRisposta(tastiera.nextLine())==true) {
            System.out.println("Questo professionista e' Palumbo?");
            if (checkRisposta(tastiera.nextLine())==true){
                tariffaMarisa=tariffaMarisa+100;  
                stampaEsito(); 
            }
            System.out.println("Questo professionista e' Bredariol?");
            if (checkRisposta(tastiera.nextLine())==true) {
                tariffaMarisa=tariffaMarisa+50;
                tariffaVentura=tariffaVentura+102;
                stampaEsito();
            }
            System.out.println("Questo professionista e' Pissarello?");
            if (checkRisposta(tastiera.nextLine())==true) {
                tariffaMarisa=tariffaMarisa+70;
                tariffaVentura=tariffaVentura+100;
                stampaEsito();
            }
            System.out.println("E' un oculista che visita nel nostro studio?");
            if (checkRisposta(tastiera.nextLine())==true) {
                System.out.println("La seconda visita viene fatta oggi?");
                if (checkRisposta(tastiera.nextLine())==true) {
                    tariffaMarisa=tariffaMarisa+50;
                    tariffaOdierna=tariffaOdierna+100;
                    stampaEsito();
                } else { // ha un appuntamento per la seconda visita.
                    System.out.println("Di conseguenza ha un altro appuntamento per la seconda visita, corretto?\n se non e' cosi' comunicalo a Marisa");
                    tariffaMarisa=tariffaMarisa+70;
                    tariffaVentura=100;
                    stampaEsito();
                }                
            }
        }
        System.out.println("E' una prima visita o l'ultima visita e' stata fatta oltre l'anno?");
        if (checkRisposta(tastiera.nextLine())==true) {
            tariffaMarisa+=80;
            stampaEsito();
        } else {
            System.out.println("Di conseguenza non ha altri appuntamenti ed è venuto a una visita da meno di un anno, corretto?\n se non è cosi' comunicalo a Marisa");
            tariffaMarisa+=70;
            stampaEsito();
        }
    }
    public static boolean checkSF(){ //controlla lo sconto famiglia
        boolean boolRisp=false;
        System.out.println("E' venuto un parente stretto negli ultimi 6 mesi?");
        if (checkRisposta(tastiera.nextLine())==true){
            if (tariffaMarisa-10>=50){
                tariffaMarisa-=10;
                return true;
            }
        }
        return boolRisp;
    }
    public static boolean checkRisposta(String risposta){
        boolean boolRisp=false;
        while(!(risposta.equalsIgnoreCase("Marisa"))){
            if (risposta.equalsIgnoreCase("si")||(risposta.equalsIgnoreCase("certo"))){
                return boolRisp=true;
            } else if (risposta.equalsIgnoreCase("no")){
                return boolRisp=false;
            }
            System.out.println("Risposta sbagliata, rispondi solo si o no;\nSi o no? ");
            risposta=tastiera.nextLine();
        }
        return boolRisp;
    }
    public static void stampaEsito(){
        boolean scontoFamiglia=checkSF();
        System.out.println("Oggi il paziente paga "+tariffaMarisa+" E a Marisa.");
        if (scontoFamiglia==true){
            System.out.print("Alla tariffa che vedi sopra e' gia' stato applicato lo sconto famiglia.");
        }
        if (tariffaVentura!=0){
            System.out.println("Alla prossima visita il paziente paghera' "+tariffaVentura+" E all'altro professionista.");
        }
        if (tariffaOdierna!=0){
            System.out.println("Oggi il paziente paga "+tariffaOdierna+" E all'altro profesionista.");
        }
        System.exit(0);
    }
}