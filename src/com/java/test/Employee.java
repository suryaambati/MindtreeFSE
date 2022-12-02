package com.java.test;

import java.util.ListIterator;

public class Employee implements Comparable<Employee> {
	
	String id;
	String name;
	int age;
	float salary;
	
	public Employee(String id, String name, int age, float salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
	

}
