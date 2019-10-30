package com.Bridgelabz.JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTest {
	int no=20;

	@Test
	void test() 
	{
		ToBinary b=new ToBinary();
		String res=b.conversion(no);
		String expected="10100";
		assertEquals(expected,res);
		
		
	}

}
