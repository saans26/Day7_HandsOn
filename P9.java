/*
 * 4)Implement the assignment 1 using TreeSet
 * 
 * 1)Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and
returns the country if exist else return null.
NOTE: You can test the methods using a main method.
 */

package Day7;

public class P9 {

	public static void main(String[] args) 
	{
		P10 p = new P10();
		
		p.saveCountryName("India");
		p.saveCountryName("America");
		p.saveCountryName("England");
		
		System.out.println(p.getCountry("India"));
		System.out.println(p.getCountry("China"));

	}

}
