package com.java.test;

public class AgeCheck {
	
	int age;
	
	public boolean Validateage(int age)throws Exception
	{
		if(age<=0)
		{
			throw new Exception();
		}
		if(age>=18)
			return true;
		else 
			return false;
		
		
		
	}

}
