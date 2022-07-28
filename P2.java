/*
 * 4) Implement the assignment 1 using Linked List
 */


package Day7;

import java.util.ArrayList;
import java.util.List;

public class P2 {

	public static void main(String[] args) 
	{
		List al = new ArrayList<>();
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
		
		System.out.println("LinkedList size - " + al.size());
		for(int i = 0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

	}
}
