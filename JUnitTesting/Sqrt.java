package com.Bridgelabz.JUnitTesting;

import java.util.Scanner;

public class Sqrt {
	public static double newton(double c)
	{
		
		double avg;
		double epsilon=1*0e-15;
		double t=c;
		
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		return t;
	}
}
