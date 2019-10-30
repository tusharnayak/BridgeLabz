package com.Bridgelabz.JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaymentTest {

	@Test
	void test() {
		Utility u=new Utility();
		double result=u.payment(1000, 2,5);
		assertEquals(4.603922231493029, result);
		
	}

}
