package com.Bridgelabz.program;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a N-value");
		int N=scan.nextInt();
		double harmonicValue=1.0;
		for(int i=2;i<N;i++)
		{
			harmonicValue=harmonicValue+(1.0/i);
		}
		System.out.println(harmonicValue);
	}

}
