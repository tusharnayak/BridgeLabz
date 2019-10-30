package com.Bridgelabz.JUnitTesting;


public class Utility 
{
	
	public static String dayOfWeek(int m,int d,int y)
	{
		if(d<=7 && y<=12)
		{
			double y0=y-(14-m)/12;
			double x=y0+(y0/4)-y0/100+y0/400;
			double m0=m+12*((14-m)/12)-2;
			double d0=(d+x+31*m0/12)%7;
			int s=(int) Math.round(d0);
			
			switch(s) {
			
			
			case 0:
				return "sunday";
			case 1:
				return "monday";
				
			case 2:
				return "tuesday";
				
			case 3:
				return "wednesday";
			
			case 4:
				return "thursday";
				
			case 5:
				return "friday";
				
			case 6:
				return "saturday";
			default:
				return "invalid day";
				
			}
		}
		return null;
	
		
	}
	
	public static double temperatureConversion(double c)
	{
		double f=(c*9/5)+32;
		return f;
	}
	public static double temperatureConversion1(double f)
	{
		double c=(f-32)*5/9;
		return c;
	}
	public static double payment(double p,double y,double rt )
	{
		double n=12*y;
		double r=rt/(12*100);
		double payment=(p*r)/Math.pow((1+r), (-n));
		return payment;
		
	}
}













