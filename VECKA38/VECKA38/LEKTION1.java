package VECKA38;

import java.util.Scanner;

public class LEKTION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Villkor.
		
		int �lder = 0; // Initierat variabel.
		
		Scanner input = new Scanner(System.in); //G�r det m�jligt att f� input fr�n konsollen.
		
		System.out.println("Hur gammal �r du?");
		�lder= input.nextInt();
		
		if (�lder > 17) { //Villkor, dvs i detta fall j�mf�r man tv� heltal
		System.out.println("Du �r gammal nog f�r att k�ra biiil");
		}
		else if (�lder > 14 && �lder < 18) {
			System.out.println("Du �r gammal nog f�r att k�ra bil"); //Ifall vilkoret inte fullf�ljs
			System.out.println("BARA S� DU VET S� KAN DU IAF �KA MOPPE; DIN J�VLA UNGE");
			}
				else {
					System.out.println("J�VLA P12:a V�NTA LITE INNAN DU F�RS�KER K�RA MOPPE O BIL VA?!?");
				}		
	}
	
}

