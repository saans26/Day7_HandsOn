/*
 * 3)Create an ArrayList that can store only numbers like int,
 * float,double,etc, but not any other data type.
 */

package Day7;

import java.util.ArrayList;
import java.util.List;

class Check<E> extends ArrayList<E>
{
	public boolean add(E e)
	{
		if(e instanceof Integer || e instanceof Float || e instanceof Double)
		{
			System.out.println(e);
			super.add(e);
			return true;
		}
		else
		{
			throw new ClassCastException("Only Numbers excepted");
		}
	}
}

public class P1 {

	public static void main(String[] args) 
	{
		List<Object> al = new Check<>();
		
		try
		{
			al.add(126);
			al.add(5.6f);
			al.add(8.76454D);
			//al.add("sans");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(al);

	}

}
