package com.Bridgelabz.program;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number you want");
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.print(2+" ");
			num=num/2;
		}
		for(int i=3;i<=Math.sqrt(num);i+=2) {
		
		
			while(num%i==0)
		{
			System.out.print(i+" ");
			num=num/i;
		}}
		if(num>2)
		{
			System.out.println(num);
		}
		
	  
	}

}
