/*
 * 1)Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and
returns the country if exist else return null.
NOTE: You can test the methods using a main method.
 */

package Day7;

import java.util.HashSet;
import java.util.Iterator;

public class P5 
{	
	HashSet<String> h1 = new HashSet<>();
	
	public void saveCountryNames(String CountryName)
	{
		h1.add(CountryName);
		
	}
	
	String getCountry(String CountryName)
	{
		Iterator<String> it = h1.iterator();
		while(it.hasNext())
		{
			if(it.next().equals(CountryName))
			{
				return CountryName;
			}
		}
		return null;
	}
}
