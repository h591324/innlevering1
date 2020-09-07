package no.hvl.dat100;

import java.util.Scanner; //bruker scanner slik at man legger inn verdier i console

public class Oppgave5 {
	public static void main(String[] args) {
		System.out.println("******* Oppgave 5 *******");
		for (int i=1; i <= 10; i++) {	//for loop for 10 studenter
		
			Scanner sc = new Scanner(System.in);
			
			
			
			
		    System.out.print("Skriv inn poeng: "); //skriver inn poeng i console
		    int poeng = sc.nextInt(); //henter verdien lager en int variabel
		    
		    if (poeng > 100 || poeng < 0) {  //sjekker om ugyldig verdi er tastet inn og krever ny inntasting 
		    	do{
		    		System.out.print("Ugyldig inntastning, prøv på nytt: ");
		    	
		    		poeng = sc.nextInt();
		    		
		    	}while (poeng > 100 || poeng < 0);	
		    }
		    
		    
		    else if (poeng <= 100 && poeng >=90) {  //sjekker verdien til inntastet tall og gir karakter etter poenggrensene
		    	System.out.println(poeng + " poeng gir karakteren A");
		    } 
		    else if (poeng <= 89 && poeng >= 80) {
		    	System.out.println(poeng + " poeng gir karakteren B");
		    } 
		    else if (poeng <= 79 && poeng >= 60) {
		    	System.out.println(poeng + " poeng gir karakteren C");
		    } 
		    else if (poeng <= 59 && poeng >= 50) {
		    	System.out.println(poeng + " poeng gir karakteren D");
		    } 
		    else if (poeng <= 49 && poeng >= 40) {
		    	System.out.println(poeng + " poeng gir karakteren E");
		    } 
		    else if (poeng <= 39 && poeng >= 0) {
		    	System.out.println(poeng + " poeng gir karakteren F");
		    } 
		    
		}
	}

}
