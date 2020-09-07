package no.hvl.dat100;

import java.util.Scanner;

public class Oppgave4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******* Oppgave 4 *******");
	      System.out.print("Skriv inn lønn: ");
	      double lonn = sc.nextInt();
	      
	      if (lonn >= 0 && lonn <= 180800) {
	    	  System.out.println("Ingen trinnskatt");
	      }
	      else if (lonn >180000 && lonn <= 254500) {
	    	  System.out.println("Trinn 1: 1,9 % trinnskatt gir: " + lonn / 100 * 1.9 + "kr i skatt");
	      }
	      else if (lonn >254500 && lonn <= 639750) {
	    	  System.out.println("Trinn 2: 4.2% trinnskatt gir: " + lonn / 100 * 4.2 + "kr i skatt");
	      }
	      else if (lonn >639750 && lonn <= 999550) {
	    	  System.out.println("Trinn 3: 13.2% trinnskatt gir: " + lonn / 100 * 13.2 + "kr i skatt");
	      }
	      else if (lonn > 999550) {
	    	  System.out.println("Trinn 4: 16.2% trinnskatt gir: " + lonn / 100 * 16.2 + "kr i skatt");
	      }
	      else {
	    	  System.out.println("Ugyldig inntasting");
	      }
	      
	      
	      
		
	}

}
