package com.Bridgelabz.JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqrtTest {

	@Test
	void sqrttest() {
		Sqrt s=new Sqrt();
		double res=s.newton(16);
		assertEquals(4, res);
		
	}

}
