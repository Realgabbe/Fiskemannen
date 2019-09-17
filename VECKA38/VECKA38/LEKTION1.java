package VECKA38;

import java.util.Scanner;

public class LEKTION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Villkor.
		
		int ålder = 0; // Initierat variabel.
		
		Scanner input = new Scanner(System.in); //Gör det möjligt att få input från konsollen.
		
		System.out.println("Hur gammal är du?");
		ålder= input.nextInt();
		
		if (ålder > 17) { //Villkor, dvs i detta fall jämför man två heltal
		System.out.println("Du är gammal nog för att köra biiil");
		}
		else if (ålder > 14 && ålder < 18) {
			System.out.println("Du är gammal nog för att köra bil"); //Ifall vilkoret inte fullföljs
			System.out.println("BARA SÅ DU VET SÅ KAN DU IAF ÅKA MOPPE; DIN JÄVLA UNGE");
			}
				else {
					System.out.println("JÄVLA P12:a VÄNTA LITE INNAN DU FÖRSÖKER KÖRA MOPPE O BIL VA?!?");
				}		
	}
	
}

