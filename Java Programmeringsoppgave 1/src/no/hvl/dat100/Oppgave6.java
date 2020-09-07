package no.hvl.dat100;

import java.util.Scanner;

public class Oppgave6 {
	public static void main(String[] args) {
		System.out.println("******* Oppgave 5 *******");
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Skriv inn et tall som er større enn 0: ");
		 int number = sc.nextInt();
		 
		 if (number > 0) {
			 int faculty = number;
			 for (int i = number - 1; i > 0; i--) {
				 faculty = faculty * i;
			 }
			 System.out.println("Fakultetet: " + faculty);
		 } else {
			 System.out.println("Du skrev inn noe ugyldig!");
		 }
		 
	}

}
