/*
 * 3) Create a Collection called TreeSet which is capable of storing String objects. 
 * Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.
 */

package Day7;

import java.util.Iterator;
import java.util.TreeSet;

public class P8 {

	public static void main(String[] args) 
	{
		TreeSet<String> t = new TreeSet<>();
		
		t.add("Sanskruti");
		t.add("Shruti");
		t.add("Sakshi");
		
		Iterator it = t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		TreeSet<String> rev = (TreeSet<String>) t.descendingSet();
		//System.out.println("Reverse Order" + rev);
		Iterator i = rev.iterator();
		while(i.hasNext())
		{
			System.out.println("Reverse Order" + i.next());
		}
		
		boolean exists = t.contains("Shruti");
		System.out.println("Shruti exists: " + exists);
		exists = t.contains("Sana");
		System.out.println("Sana exists: " + exists);

	}

}
