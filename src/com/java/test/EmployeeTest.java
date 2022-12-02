package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class EmployeeTest {

	public static void main(String[] args) {

		
		ArrayList emplist = new ArrayList();
		
		emplist.add(new Employee("101","Surya",25,25000.0f));
		emplist.add(new Employee("103","Ambati",24,20000.0f));
		emplist.add(new Employee("102","prakash",35,23000.0f));
		emplist.add(new Employee("105","Naveen",26,33000.0f));
		emplist.add(new Employee("104","Siva",28,38000.0f));
		
		System.out.println("Using For Loop");
		
		for(int i =0;i<emplist.size();i++)
		{
			System.out.println(emplist.get(i).toString());
		}
		
		System.out.println("using For each");
		
	 
		for (Object e : emplist) {
			System.out.println(e.toString());
			
		}
		
		System.out.println("Using Stream");
		
		emplist.stream().forEach(emp -> System.out.println(emp));
		
		System.out.println("Sorting employees using name");
		
		Collections.sort(emplist);
		
		for (Object e : emplist) {
			System.out.println(e.toString());
			
		}
		
		
		ListIterator<Employee> el = emplist.listIterator();
		
		System.out.println("Forward Direction Iteration using ListIterator");
		
		while(el.hasNext())
		{
			System.out.println(el.next());
		}
		
System.out.println("Backword Direction Iteration using ListIterator");
		
		while(el.hasPrevious())
		{
			System.out.println(el.previous());
		}
		
		
		
		
	}

}
