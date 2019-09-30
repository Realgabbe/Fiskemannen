package modulus;

public class V40LEKTION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// % == modulus, är

		//int tal1 = 48;
		//int tal2 = 19;
		//int tal3 = 69;
		//int tal4 = -137;

		//System.out.println(tal1 % 3); // testar ifall tal1 är delbart med 3,
										// är den det så blir svaret 0, om inte
										// så anges rest.

		//int sum = 0;
		
		//for (int i = 0; i < 101; i++) {

			//if (i % 3 == 0) {
				//System.out.println("talet " + i + " är delbart med 3");
				
				//sum += i;
			//}
			
		//}
		//System.out.println("The total integers divisible by 3 is: " + sum);
		
		int turn = 0;
		
		while (true) {
		
			turn++;
			
			if(turn % 3 == 0) {
			System.out.println("Davids tur");	
			}
				
			else if (turn %3 == 1) {
			System.out.println("Johans tur");	
			}
			
			else if (turn %3 == 1) {
			System.out.println("Lucas tur");	
			}
			
			}
		
		}
	}


