package com.Bridgelabz.functional;

public class SumOfThreeIntegersZero {
	public static void main(String[] args) {
		int[] a= {3,-1,-7,-4,-5,9,10};
		triple(a);
		

	}
	public static void triple(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println("found 3 element whose sum is 0");
						System.out.print(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}


}
