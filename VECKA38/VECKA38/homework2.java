package VECKA38;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;

		Scanner input = new Scanner(System.in);

		System.out.println(
				"Skriv fem heltal s� visar jag vilket som �r h�gst, l�gst och medelv�rdet p� de fem heltalen.");
		System.out.println("\n" + "Skriv fem till hetlal");
		number1 = input.nextInt();

		System.out.println("Skriv fyra till heltal");
		number2 = input.nextInt();

		System.out.println("Skriv tre till heltal");
		number3 = input.nextInt();

		System.out.println("Skriv tv� till heltal");
		number4 = input.nextInt();

		System.out.println("Skriv ett till heltal");
		number5 = input.nextInt();

		if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {

			System.out.println("\n" + "Talet som �r st�rst �r:" + number1 + "\n");
		}

		if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {

			System.out.println("Talet som �r st�rst �r:" + number2 + "\n");
		}

		if (number3 > number2 && number3 > number1 && number3 > number4 && number3 > number5) {

			System.out.println("Talet som �r st�rst �r:" + number3 + "\n");
		}

		if (number4 > number2 && number4 > number3 && number4 > number1 && number4 > number5) {

			System.out.println("Talet som �r st�rst �r:" + number4 + "\n");
		}

		if (number5 > number2 && number5 > number3 && number5 > number4 && number5 > number1) {

			System.out.println("Talet som �r st�rst �r:" + number5 + "\n");
		}

		
		if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5) {

			System.out.println("Talet som �r minst �r:" + number1 + "\n");
		}

		if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5) {

			System.out.println("Talet som �r minst �r:" + number2 + "\n");
		}
		if (number3 < number2 && number3 < number1 && number3 < number4 && number3 < number5) {

			System.out.println("Talet som �r minst �r:" + number3 + "\n");
		}
		if (number4 < number2 && number4 < number3 && number4 < number1 && number4 < number5) {

			System.out.println("Talet som �r minst �r:" + number4 + "\n");
		}
		if (number5 < number2 && number5 < number3 && number5 < number4 && number5 < number1) {

			System.out.println("Talet som �r minst �r:" + number5 + "\n");
		}

		
		System.out.println("Medelv�rdet p� de heltal du skrev in (avrundat ned�t) �r:" + (number1 + number2 + number3 + number4 + number5)/5);
		
	}

}
