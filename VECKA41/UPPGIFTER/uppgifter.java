package UPPGIFTER;

import java.util.Scanner; 

public class uppgifter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//1:a uppgiften
		//int tal1 = 0;
		//int tal2 = 0;
		//
		//tal1 = input.nextInt();
		//tal2 = input.nextInt();
		//
		//if(tal1 > tal2) {
		//	System.out.println("\n" + tal1);
		//}
		//
		//else {
		//	System.out.println("\n" + tal2);
		//}
		
		
		//2:a uppgiften
		int tal = 0;
		//
		//Dumt sätt
		//System.out.println("Skriv ett heltal med mellanrum mellan varje siffra så räknar jag ut siffersumman av det talet ex: 2 2 2 2 = 2+2+2+2 =8");
		//
		//tal = input.nextInt() + input.nextInt() + input.nextInt() + input.nextInt();
		//
		//System.out.println(tal);
		//
		//Bättre sätt
		
		System.out.println("Skriv ett heltal mellan 1-999,999");
		
		int siffra1 = 0;
		int siffra2 = 0;
		int siffra3 = 0;
		int siffra4 = 0;
		int siffra5 = 0;
		int siffra6 = 0;
		
		int tal2 = 0;
		int tal3 = 0;
		int tal4 = 0;
		int tal5 = 0;
		int tal6 = 0;
		int tal7 = 0;
		
		int talsumma = 0;
		
		tal = input.nextInt();
		
		siffra1 = tal % 10;
		tal2 = tal/10;
		
		siffra2 = tal2 % 10;
		tal3 = tal2/10;
		
		siffra3 = tal3 % 10;
		tal4 = tal3/10;
		
		siffra4 = tal4 % 10;
		tal5 = tal4/10;
		
		siffra5 = tal5 % 10;
		tal6 = tal5/10;
		
		siffra6 = tal6 % 10;
		tal7 = tal6/10;
		
		talsumma = (siffra1 + siffra2 + siffra3 + siffra4 + siffra5 + siffra6);
		
		System.out.println("Tallsumman är: " + talsumma);
	}

}
