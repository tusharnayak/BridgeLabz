package com.Bridgelabz.program;

public class PowerOf2 {
	public static void main(String[] args) {
		int N=Integer.parseInt(args[0]);
		if(N>=1 && N<=30)
		{
			for(int i=1;i<N;i++)
			{
				System.out.println(Math.pow(2,i));
			}
			if(N%400==0 || N%4==0 && N%100!=0)
			{
				System.out.println("year is leap year");
			}
			else
			{
				System.out.println("year is not a leap year");
			}
		}
		else
		{
			System.out.println("overFlow condition");
		}
	}


}
