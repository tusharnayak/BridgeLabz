package com.Bridgelabz.JUnitTesting;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) 
	{
		Utility u=new Utility();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the temp in celcius");
		double f=scan.nextDouble();
		System.out.println(u.temperatureConversion(f));
		System.out.println("enter the temp in fahreinheit");
		double c=scan.nextDouble();
		System.out.println(u.temperatureConversion1(c));
	}

}
