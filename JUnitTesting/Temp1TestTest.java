package com.Bridgelabz.JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Temp1TestTest {

	@Test
	void temp1Test() {
		Utility u=new Utility();
		double result=u.temperatureConversion1(68.0);
		assertEquals(20, result);
	}

}
