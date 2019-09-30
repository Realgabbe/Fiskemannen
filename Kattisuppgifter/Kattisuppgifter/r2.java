package Kattisuppgifter;

import java.util.Scanner;

public class r2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int R1 = 0;
		int S = 0;
		
		R1 = input.nextInt();
		S = input.nextInt();
		
		
		System.out.println((int) ((S-(R1)/2.0)*2.0));
	}

}
