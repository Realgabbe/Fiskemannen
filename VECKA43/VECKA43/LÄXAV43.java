package VECKA43;

import java.util.Scanner;

public class LÄXAV43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lol();
		
		int a;
		int b;

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv två heltal: ");

		a = input.nextInt();
		b = input.nextInt();
		
		System.out.println(max(a,b));
	}

	/**
	 * Skriver ut "XAXAXAXAXAXAX"
	 */
	
	
	public static void lol() {

		System.out.println("XAXAXAXAXAXAX");

	}
	
	public static int max(int a, int b) {

		if (a >= b) {
			return a;
		} else {
			return b;
		}
		

	}

}