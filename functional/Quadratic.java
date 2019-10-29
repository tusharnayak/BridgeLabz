package com.Bridgelabz.functional;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value");
		double a=scan.nextDouble();
		System.out.println("enter the b value");
		double b=scan.nextDouble();
		System.out.println("enter the c value");
		double c=scan.nextDouble();
		double delta=(b*b)-4*a*c;
		double root1=(-b+Math.sqrt(delta))/(2*a);
		double root2=(-b-Math.sqrt(delta))/(2*a);
		if(delta>0)
		{
			root1=(-b+Math.sqrt(delta))/(2*a);
			root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println(root1+" "+root2);
		}
		else
		{
			double real=-b/(2*a);
			double imaginary=Math.sqrt(-delta)/2*a;
			System.out.println("real part="+real+"imaginary="+imaginary);
		}
	}


}
