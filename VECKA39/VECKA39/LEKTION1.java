package VECKA39;

import java.util.Scanner;

public class LEKTION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 101; i++) { // Uppgift 1
			System.out.println(i);
		}

		System.out.println("\n");

		for (int i = 25; i < 51; i++) { // Uppgift 2
			System.out.println(i);
		}

		System.out.println("\n");

		for (int i = 20; i > 0; i--) { // Uppgift 3
			System.out.println(i);

		}

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv ett heltal mellan 0-10");

		int tal1 = input.nextInt();

		int tal2 = 0;

		if (tal1 < 11 && tal1 > 0) {
			tal2 = tal1 / tal1 + 1;
			System.out.println(tal1 * tal2);

		}

		else {
			System.out.println("Jag sa ett heltal mellan 0-10!");

		}

		System.out.println("\n");

		for (int i = 100; i < 1002; i += 2) { // Uppgift 8
			System.out.println(i);

		}

	}

}
