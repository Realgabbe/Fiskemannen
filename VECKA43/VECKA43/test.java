package VECKA43;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int heltal1 = 0;
		int heltal2 = 0;
		int heltal3 = 0;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv två heltal.");
		
		heltal1 = input.nextInt();
		heltal2 = input.nextInt();
		heltal3 = input.nextInt();
		
		if (heltal1 > heltal2 && heltal1 > heltal3) {
			System.out.println(heltal1 + " Är det största talet");
		}
		
		if (heltal2 > heltal3 && heltal2 > heltal1) {
			System.out.println(heltal2 + " Är det största talet");
			
		if (heltal3 > heltal2 && heltal3 > heltal1) {
			System.out.println(heltal3 + " Är det största talet");
		}
	}

}
	
}
