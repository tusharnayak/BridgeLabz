package com.Bridgelabz.program;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a year ");
		int year=scan.nextInt();
		if(year>=1000 && year<=9999)
		{
		if(year%400==0 || year%4==0 && year%100!=0)
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
			System.out.println("invalid year you have provide");
		}
	}


}
