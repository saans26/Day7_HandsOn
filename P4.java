/*
 * 6) Write a program that will have a Vector which is capable of storing Employee 
 * objects. Use an Iterator and enumeration to list all the elements of the Vector.
 */


package Day7;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employee 
{
	private int id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, double sal)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = sal;
		
		System.out.println("Id = " + id + "Name = " + name + "Salary = " + sal);
	}
}
public class P4 {

	public static void main(String[] args) 
	{
		Vector<Employee> v = new Vector<>();
		
		v.add(new Employee(01, "Sanskruti", 500000));
		v.add(new Employee(02, "Shruti", 700000));
		
		Iterator<Employee> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		Enumeration<Employee> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
