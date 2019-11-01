package com.Bridgelabz.Algorithm;

public class PrimeNumberRange {
	public static void primeNum()
	 {
		int rem;
		int sum = 0;
		String primeNumbers="";
		for(int i=1;i<1000;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				primeNumbers=primeNumbers+i+" ";
			}
		}
		System.out.println("primeNumbers are:");
		System.out.println(primeNumbers);
	}
	public static void main(String[] args)
	{
		PrimeNumberRange pn=new PrimeNumberRange();
		pn.primeNum();
	}
			

}
