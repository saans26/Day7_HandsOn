package Day7;

import javax.annotation.processing.SupportedSourceVersion;

public class P6 {

	public static void main(String[] args) 
	{
		P5 a = new P5();
		
		a.saveCountryNames("India");
		a.saveCountryNames("Malaysia");
		a.saveCountryNames("China");
		a.saveCountryNames("America");
		
		System.out.println(a.getCountry("England"));
		
		 System.out.println(a.getCountry("India"));

	}

}
