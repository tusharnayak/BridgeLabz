package com.Bridgelabz.program;

import java.util.Scanner;

public class FlipCoins {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many times you want to flip the coin");
		int x=scan.nextInt();
		int countHead=0;
		int countTail=0;
		double percentHead=0;
		double percentTail=0;
		for(int i=1;i<=x;i++)
		{
		if(Math.random()<0.5)
		{
			System.out.println("head");
			countHead++;
		}
		
		
		else
		{
			System.out.println("Tail");
			countTail++;
		}
		percentHead=countHead*10;
		percentTail=countTail*10;
		
	  }
		System.out.println("total head="+countHead);
		System.out.println("total tails="+countTail);
		
		System.out.println("head percentage="+percentHead+"%");
		System.out.println("tail percentage="+percentTail+"%");
	}


}
