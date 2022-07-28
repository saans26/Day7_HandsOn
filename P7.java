/*
 * 2)Write a program to store a group of employee names into 
 * a HashSet, retrieve the elements one by one using an Iterator.
 */


package Day7;

import java.util.HashSet;
import java.util.Iterator;


public class P7 {

	public static void main(String[] args) 
	{
		HashSet<String> h = new HashSet<>();
		
		h.add("Sanskruti");
		h.add("Shruti");
		h.add("Sakshi");
		
		Iterator<String> it = h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
