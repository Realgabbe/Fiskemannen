package Kattisuppgifter;

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int X = 0;
		int Y = 0;
		int N = 0;
		
		X = input.nextInt();
		Y = input.nextInt();
		N = input.nextInt();	
		
		for (int i = 1; i <= N; i++) {
			if (i % X == 0 && i % Y == 0) {
				System.out.println("FizzBuzz");
			} else if (i % X == 0) {
				System.out.println("Fizz");
			} else if (i % Y == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
