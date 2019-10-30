package com.Bridgelabz.JUnitTesting;

public class Payment {

	public static void main(String[] args) {
		Utility u=new Utility();
        
		double P=Double.parseDouble(args[0]);
		double Y=Double.parseDouble(args[1]);
		double R=Double.parseDouble(args[2]);
		double n=12*Y;
		double r=R/(12*100); 
		
		
		System.out.println(u.payment(P,Y,R));
		
		

	}

}
