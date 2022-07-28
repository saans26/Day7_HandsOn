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

import java.util.Iterator;
import java.util.TreeSet;

public class P10 
{
	TreeSet<String> t = new TreeSet<>();
	
	public TreeSet<String> saveCountryName(String CountryName)
	{
		t.add(CountryName);
		return t;	
	}
	
	public String getCountry(String CountryName)
	{
		Iterator<String> it = t.iterator();
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
