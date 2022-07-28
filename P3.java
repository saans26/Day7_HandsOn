/*
 * 5) Implement the assignment 1 using Vector
 */

package Day7;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class P3 {

	public static void main(String[] args) 
	{
		Vector al = new Vector();
		
		System.out.println("Vector Capacity - " + al.capacity());
		System.out.println("vector size=" + al.size());
		
		al.add("January");
		al.add("February");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("Augest");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");
		
		System.out.println("Vector Capacity - " + al.capacity());
		System.out.println("vector size=" + al.size());
		Enumeration e = al.elements();

	    while(e.hasMoreElements()) 
	    {
	      System.out.println(e.nextElement());
	    }


	}

}
