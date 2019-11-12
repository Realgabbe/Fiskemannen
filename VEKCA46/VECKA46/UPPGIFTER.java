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
		Medelv�rde(input);
		smallletters(input);
		programmering(input);
		Time(input);
		arbete(input);
		velocityToHeight(input);
	}
/**
 * 
 * @param input l�ser in en temperatur i fahrenheit
 * @return returnerar kelvin som blivit omvandlat fr�n fahrenheit
 */
	public static double FahrenheitToKelvin(Scanner input) {

		System.out.println("Skriv en temperatur i fahrenheit s� omvanldar jag den till kelvin.");

		double fahrenheit = input.nextDouble();
		
		double kelvin = ((((fahrenheit-32)*5)/9)+273.15);
		
		return kelvin;
	}

	/**
	 * 
	 * @param input l�ser in en temperatur i kelvin fr�n konsollen
	 * @return skickar tillbaka den i grader celsius
	 */
	
	public static double KelvinToCelsius(Scanner input) {

		System.out.println("Skriv en temperatur i kelvin s� omvanldar jag den till celsius.");

		double kelvin = input.nextDouble();
		
		double celsius = kelvin - 273.15;
		
		return celsius;
		
	}

	/**
	 * 
	 * @param input l�ser in en hastighet i km/h
	 * @return skickar tillbaka hastigheten i m/s
	 */
	
	public static double VelocityConversion(Scanner input) {

		System.out.println("Skriv en hastighet i km/h s� omvandlar jag den till m/s");

		double KmH = input.nextDouble();
		
		double MS = KmH/3.6;
		
		return MS;
	}

	/**
	 * 
	 * @param input L�ser in en massa och en hastighet
	 * @return Skickar tillbaka m�ngden r�relseenergi
	 */
	
	public static double KineticEnergy(Scanner input) {

		System.out.println("Skriv en massa och sedan en hastighet s� r�knar jag ut r�relseenergin.");

		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		
		double R�relseEnergi = (massa*(Math.pow(massa, 2)))/2;
		
		return R�relseEnergi;
		
	}
	
	/**
	 * 
	 * @param input l�ser in en massa och en h�jd
	 * @return skickar tillbaka den potensiella energins v�rde
	 */
	
	public static double PotentialEnergy(Scanner input) {

		System.out.println("Skriv en massa i kg och sedan en h�jd i m s� r�knar jag ut den potentiella energin.");

		double massa = input.nextDouble();
		double h�jd = input.nextDouble();
		
		double potensiellenergi = massa*9.82*h�jd;
		
		return potensiellenergi;
		
	}
	/**
	 * 
	 * @param input L�ser in tre stycken tal fr�n konsollen.
	 * @return Skickar tillbaka medelv�rdet av de tre talen
	 */
	public static double Medelv�rde(Scanner input) {
		
		System.out.println("Skriv tre tal s� r�knar jag ut medelv�rdet p� de");
		
		double tal1 = input.nextDouble();
		double tal2 = input.nextDouble();
		double tal3 = input.nextDouble();
		
		double medelv�rde = (tal1+tal2+tal3)/3;
		
		return medelv�rde;
				
	}
	
	/**
	 * 
	 * @param input l�ser in en String 
	 * @return skickar tillbaka inputen men omvandlat stora bokst�ver till sm�
	 */
	
	public static String smallletters(Scanner input) {
		
		System.out.println("Skriv n�got s� omvandlar jag alla stora bokst�ver till sm�");
	
		String ord = input.next();
		
		String tillbaka = ord.toLowerCase();
		
		return tillbaka;
	}
	
	/**
	 * 
	 * @param input l�ser in input fr�n konsollen
	 * @return skickar tillbaka inputen men d�r alla o:n �r 0:or ist�llet och alla sm� bokst�ver blivit stora
	 */
	public static String programmering(Scanner input) {
		
		System.out.println("Skriv in n�got s� omvandlar jag alla sm� bokst�ver till stora och alla o:on till 0:or");

		String ord = input.next();
		
		String bearbetning = ord.replace('O', 'o');
		String bearbetning2 = bearbetning.replace('o', '0');
		String klar = bearbetning2.toUpperCase();
		
		return klar;
		
	}
	
	
	/**
	 * 
	 * @param input l�ser in en distans och en hastighet
	 * @return skickar tillbaka m�ngden tid det kommer att ta
	 */
	public static double Time(Scanner input) {
		
		System.out.println("Skriv in en distans och en hastighet s� skickar jag tillbaka m�ngden tid det kommer att ta");
		
		double distans = input.nextDouble();
		double hastighet = input.nextDouble();
		
		double tid = distans/hastighet;
		
		return tid;
				
	}
	
	/**
	 * 
	 * @param input l�ser in en kraft och en str�cka fr�n konsollen
	 * @return skickar tillbaka m�ngden arbete som kr�vs 
	 */
	
	public static double arbete(Scanner input) {
		
		System.out.println("Skriv in en kraft och en str�cka s� omvandlar jag det till arbete utf�t");
		
		double kraft = input.nextDouble();
		double distans = input.nextDouble();
		
		double arbete = kraft*distans;
		
		return arbete;
	}
	
	public static double velocityToHeight(Scanner input) {
		
		System.out.println("Skriv in en massa och en hastighet s� s�ger jag hur l�ngt upp�t den kan �ka");
		
		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		
		

	}
	
}
