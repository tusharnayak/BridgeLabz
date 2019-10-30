package com.Bridgelabz.JUnitTesting;

public class ToBinary {
	public static String conversion(int no)
	{
		int res[]=new int[100];
		
		String temp = "";
		String temp1="";
		while(no>0)
		{
			int rem = no%2;
			no = no/2;
			System.out.println(rem);
			temp=temp+rem;
		}
		
		for(int i=temp.length()-1;i>=0;i--) {
			temp1=temp1+temp.charAt(i);
		}
		
		return temp1;
	}
	
}
