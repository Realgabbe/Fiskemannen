package VECKA43;

import java.util.Scanner;

public class LÄXAV43 {

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

		System.out.println("Skriv två heltal:");

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

		System.out.println("Skriv en temperatur i celsius så omvandlar jag den till kelvin");

		double kelvinToCelsius = -273.15;
		double celsius = 0;

		celsius = input.nextDouble();

		System.out.println("Temperaturen du angav i celsius blir i kelvin: " + (celsius + kelvinToCelsius));

	}

	public static void fahrenheit(Scanner input) {

		System.out.println("Ange en temperatur i fahrenheit så omvandlar jag den till celsius :)");

		double fahrenheit = 0;
		fahrenheit = input.nextDouble();

		System.out.println("Temperaturen du angav i fahrenheit blir i celsius: " + ((fahrenheit - 32) * 5) / 9 + "C°");

	}

	public static void agecontrol(Scanner input) {

		System.out.println("Ange din ålder så säger jag något beroende på din ålder :)");

		int age = 0;
		age = input.nextInt();

		if (age < 0) {
			System.out.println("Du är inte född än");
		}
		if (age < 6 && age > -1) {
			System.out.println("Du får inte göra ett skit");
		}
		if (age < 12 && age > 5) {
			System.out.println("Du får spela FORTNITE");
		}
		if (age < 15 && age > 12) {
			System.out.println("Du är tonåring");
		}
		if (age < 18 && age > 14) {
			System.out.println("Du får köra moppe");
		}
		if (age < 21 && age > 17) {
			System.out.println("Du får köra bil");
		}
		if (age < 65 && age > 20) {
			System.out.println("Du får vuxenstraff om du gör något dumt");
		}
		if (age < 100 && age > 64) {
			System.out.println("Du är pensionär");
		}
		if (age > 100) {
			System.out.println("Om du inte redan är död så kommer du vara det snart, förbered dig :)");
		}

	}

	public static void stairs(Scanner input) {

		System.out.println("Skriv ett tal så gör jag en pyramid med den basen :)");

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


