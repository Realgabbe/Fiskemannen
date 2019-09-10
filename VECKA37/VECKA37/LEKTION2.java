package VECKA37;

import java.util.Scanner;

public class LEKTION2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String namn1 = "APHUVUD 273";
		String namn2 = "GORILLJÄVEL";
		String namn3 = "T H I C C SHREK";
		
		System.out.println("SKRIV ETT NAMN FOR HELVETE"); // Skriver ut ett meddelande
		
		String namn4 = input.nextLine(); //Läser in ett namn från konsolen
		
		System.out.println("SKRIV ETT NAMN FOR HELVETE");
		
		String namn5 = input.nextLine();
	
		System.out.println("\nNAMN:");
		System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "\n" + namn5);
		
	}

}
