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
		Medelvärde(input);
		smallletters(input);
		programmering(input);
		Time(input);
		arbete(input);
		velocityToHeight(input);
	}
/**
 * 
 * @param input läser in en temperatur i fahrenheit
 * @return returnerar kelvin som blivit omvandlat från fahrenheit
 */
	public static double FahrenheitToKelvin(Scanner input) {

		System.out.println("Skriv en temperatur i fahrenheit så omvanldar jag den till kelvin.");

		double fahrenheit = input.nextDouble();
		
		double kelvin = ((((fahrenheit-32)*5)/9)+273.15);
		
		return kelvin;
	}

	/**
	 * 
	 * @param input läser in en temperatur i kelvin från konsollen
	 * @return skickar tillbaka den i grader celsius
	 */
	
	public static double KelvinToCelsius(Scanner input) {

		System.out.println("Skriv en temperatur i kelvin så omvanldar jag den till celsius.");

		double kelvin = input.nextDouble();
		
		double celsius = kelvin - 273.15;
		
		return celsius;
		
	}

	/**
	 * 
	 * @param input läser in en hastighet i km/h
	 * @return skickar tillbaka hastigheten i m/s
	 */
	
	public static double VelocityConversion(Scanner input) {

		System.out.println("Skriv en hastighet i km/h så omvandlar jag den till m/s");

		double KmH = input.nextDouble();
		
		double MS = KmH/3.6;
		
		return MS;
	}

	/**
	 * 
	 * @param input Läser in en massa och en hastighet
	 * @return Skickar tillbaka mängden rörelseenergi
	 */
	
	public static double KineticEnergy(Scanner input) {

		System.out.println("Skriv en massa och sedan en hastighet så räknar jag ut rörelseenergin.");

		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		
		double RörelseEnergi = (massa*(Math.pow(massa, 2)))/2;
		
		return RörelseEnergi;
		
	}
	
	/**
	 * 
	 * @param input läser in en massa och en höjd
	 * @return skickar tillbaka den potensiella energins värde
	 */
	
	public static double PotentialEnergy(Scanner input) {

		System.out.println("Skriv en massa i kg och sedan en höjd i m så räknar jag ut den potentiella energin.");

		double massa = input.nextDouble();
		double höjd = input.nextDouble();
		
		double potensiellenergi = massa*9.82*höjd;
		
		return potensiellenergi;
		
	}
	/**
	 * 
	 * @param input Läser in tre stycken tal från konsollen.
	 * @return Skickar tillbaka medelvärdet av de tre talen
	 */
	public static double Medelvärde(Scanner input) {
		
		System.out.println("Skriv tre tal så räknar jag ut medelvärdet på de");
		
		double tal1 = input.nextDouble();
		double tal2 = input.nextDouble();
		double tal3 = input.nextDouble();
		
		double medelvärde = (tal1+tal2+tal3)/3;
		
		return medelvärde;
				
	}
	
	/**
	 * 
	 * @param input läser in en String 
	 * @return skickar tillbaka inputen men omvandlat stora bokstäver till små
	 */
	
	public static String smallletters(Scanner input) {
		
		System.out.println("Skriv något så omvandlar jag alla stora bokstäver till små");
	
		String ord = input.next();
		
		String tillbaka = ord.toLowerCase();
		
		return tillbaka;
	}
	
	/**
	 * 
	 * @param input läser in input från konsollen
	 * @return skickar tillbaka inputen men där alla o:n är 0:or istället och alla små bokstäver blivit stora
	 */
	public static String programmering(Scanner input) {
		
		System.out.println("Skriv in något så omvandlar jag alla små bokstäver till stora och alla o:on till 0:or");

		String ord = input.next();
		
		String bearbetning = ord.replace('O', 'o');
		String bearbetning2 = bearbetning.replace('o', '0');
		String klar = bearbetning2.toUpperCase();
		
		return klar;
		
	}
	
	
	/**
	 * 
	 * @param input läser in en distans och en hastighet
	 * @return skickar tillbaka mängden tid det kommer att ta
	 */
	public static double Time(Scanner input) {
		
		System.out.println("Skriv in en distans och en hastighet så skickar jag tillbaka mängden tid det kommer att ta");
		
		double distans = input.nextDouble();
		double hastighet = input.nextDouble();
		
		double tid = distans/hastighet;
		
		return tid;
				
	}
	
	/**
	 * 
	 * @param input läser in en kraft och en sträcka från konsollen
	 * @return skickar tillbaka mängden arbete som krävs 
	 */
	
	public static double arbete(Scanner input) {
		
		System.out.println("Skriv in en kraft och en sträcka så omvandlar jag det till arbete utföt");
		
		double kraft = input.nextDouble();
		double distans = input.nextDouble();
		
		double arbete = kraft*distans;
		
		return arbete;
	}
	
	public static double velocityToHeight(Scanner input) {
		
		System.out.println("Skriv in en massa och en hastighet så säger jag hur långt uppåt den kan åka");
		
		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		
		

	}
	
}
