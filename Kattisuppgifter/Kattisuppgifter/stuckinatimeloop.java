package Kattisuppgifter;

import java.util.Scanner;

public class stuckinatimeloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		
		for(int i = 1; N >= i; i ++) {
			System.out.println(i + " Abracadabra");
		}

	}

}
