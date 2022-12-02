package com.java.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeCheckTest {

	@Test
	public void ValidateageValid() throws Exception
	{
		int a =18;
		AgeCheck age = new AgeCheck();
		boolean input = age.Validateage(a);
		Assertions.assertTrue(input);
		
	}
	@Test
	public void ValidateageinValid() throws Exception
	{
		int a =0;
		AgeCheck age = new AgeCheck();
	
		Exception e = Assertions.assertThrows(Exception.class, ()->age.Validateage(a));
		
	}
}
