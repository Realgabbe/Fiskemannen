package VECKA46;

import java.util.Scanner;

public class UPPGIFTER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		FahrenheitToKelvin(input);
		KelvinToCelsius(input);
		VelocityConversion(input);
		KineticEnergy(input);
		PotentialEnergy(input);
		
	}

	public static void FahrenheitToKelvin(Scanner input) {

		System.out.println("Skriv en temperatur i fahrenheit så omvanldar jag den till kelvin.");

		double fahrenheit = input.nextDouble();
		
		System.out.println((((fahrenheit-32)*5)/9)+273.15);
		
	}
	
	public static void KelvinToCelsius(Scanner input) {

		System.out.println("Skriv en temperatur i kelvin så omvanldar jag den till celsius.");

		double kelvin = input.nextDouble();
		
		double celsius = kelvin - 273.15;
		
		System.out.println("Din temperatur blir i celsius: " + celsius + "C°");
		
	}

	public static void VelocityConversion(Scanner input) {

		System.out.println("Skriv en hastighet i km/h så omvandlar jag den till m/s");

		double KmH = input.nextDouble();
		
		double MS = KmH/3.6;
		
		System.out.println("Saftigheten du skrev in i km/h blir i m/s: " + MS);
	}

	public static void KineticEnergy(Scanner input) {

		System.out.println("Skriv en massa och sedan en hastighet så räknar jag ut rörelseenergin.");

		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		
		double RörelseEnergi = (massa*(Math.pow(massa, 2)))/2;
		
		System.out.println("Rörelsenergin av de två variablerna du skrev in blir: " + RörelseEnergi);
		
	}
	
	public static void PotentialEnergy(Scanner input) {

		System.out.println("Skriv en massa och sedan en hastighet så räknar jag ut rörelseenergin.");

		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		
		double RörelseEnergi = (massa*(Math.pow(massa, 2)))/2;
		
		System.out.println("Rörelsenergin av de två variablerna du skrev in blir: " + RörelseEnergi);
		
	}
	
}
