package VECKA43;

import java.util.Scanner;

public class L�XAV43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		
		 lol(); 
		 max(input); 
		 count(input); 
		 kelvin(input); 
		 fahrenheit(input);
		 agecontrol(input);
		 stairs(input);
	}

	/**
	 * Skriver ut "XAXAXAXAXAXAX"
	 */

	public static void lol() {

		System.out.println("XAXAXAXAXAXAX");

	}

	public static void max(Scanner input) {

		System.out.println("Skriv tv� heltal:");

		int a = input.nextInt();
		int b = input.nextInt();

		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}

	public static void count(Scanner input) {

		int n = 0;

		System.out.println("Skriv ett heltal:");

		n = input.nextInt();

		for (int i = 0; i <= n; i++) {

			System.out.println(i);
		}

	}

	public static void kelvin(Scanner input) {

		System.out.println("Skriv en temperatur i celsius s� omvandlar jag den till kelvin");

		double kelvinToCelsius = -273.15;
		double celsius = 0;

		celsius = input.nextDouble();

		System.out.println("Temperaturen du angav i celsius blir i kelvin: " + (celsius + kelvinToCelsius));

	}

	public static void fahrenheit(Scanner input) {

		System.out.println("Ange en temperatur i fahrenheit s� omvandlar jag den till celsius :)");

		double fahrenheit = 0;
		fahrenheit = input.nextDouble();

		System.out.println("Temperaturen du angav i fahrenheit blir i celsius: " + ((fahrenheit - 32) * 5) / 9 + "C�");

	}

	public static void agecontrol(Scanner input) {

		System.out.println("Ange din �lder s� s�ger jag n�got beroende p� din �lder :)");

		int age = 0;
		age = input.nextInt();

		if (age < 0) {
			System.out.println("Du �r inte f�dd �n");
		}
		if (age < 6 && age > -1) {
			System.out.println("Du f�r inte g�ra ett skit");
		}
		if (age < 12 && age > 5) {
			System.out.println("Du f�r spela FORTNITE");
		}
		if (age < 15 && age > 12) {
			System.out.println("Du �r ton�ring");
		}
		if (age < 18 && age > 14) {
			System.out.println("Du f�r k�ra moppe");
		}
		if (age < 21 && age > 17) {
			System.out.println("Du f�r k�ra bil");
		}
		if (age < 65 && age > 20) {
			System.out.println("Du f�r vuxenstraff om du g�r n�got dumt");
		}
		if (age < 100 && age > 64) {
			System.out.println("Du �r pension�r");
		}
		if (age > 100) {
			System.out.println("Om du inte redan �r d�d s� kommer du vara det snart, f�rbered dig :)");
		}

	}

	public static void stairs(Scanner input) {

		System.out.println("Skriv ett tal s� g�r jag en pyramid med den basen :)");

		int n = 0;
		n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
	        int k = i;
	        for(int j = 1; j <= n - k; j++) {
	            System.out.print(" ");
	        }
	        for(int j = 1; j <= k; j++) {
	            System.out.print("#");
	        }
	        System.out.println();
	    }

	}

	}


