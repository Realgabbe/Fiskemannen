package VECKA43;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tal1;
		int tal2;

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv tv� heltal: ");

		tal1 = input.nextInt();
		tal2 = input.nextInt();

		if (tal1 <= tal2) {
			System.out.println("Minsta talet �r: " + tal1);

		}

		else {
			System.out.println("Minsta talet �r: " + tal2);

			System.out.println(minstaTal(tal1, tal2));
			
			
		}
	}

	/**
	 * 
	 * @param tal1	
	 * @param tal2
	 * @return
	 */
	
	public static String minstaTal(int tal3, int tal4) {

		if (tal3 <= tal4) {
			System.out.println("Minsta talet �r: " + tal3);
		} else {
			System.out.println("Minsta talet �r: " + tal4);
		}
		
		String hej = "Metoden �r klar!";
		
		return hej;
		
	}
}
