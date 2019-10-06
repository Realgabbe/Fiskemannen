package Kattisuppgifter;

import java.util.Scanner;

public class spavanac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int H = 0;
		int M = 0;
		int TMSum = 0;

		H = input.nextInt();
		M = input.nextInt();

		TMSum = H * 60 + M;
		TMSum = TMSum - 45;

		if (TMSum < 0) {
			TMSum = TMSum + 60 * 24;
		}

		H = TMSum / 60;
		M = TMSum - H * 60;

		System.out.println(H + " " + M);

	}

}
