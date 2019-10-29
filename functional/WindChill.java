package com.Bridgelabz.functional;

public class WindChill {
	public static void main(String[] args) {
		int t=Integer.parseInt(args[0]);
		int v=Integer.parseInt(args[1]);
		double w;
		if(t<50 && v<120 && v>3)
		{
		double a=(0.4275*t)-35.75;
		double b=0.16;
		w=35.74+(0.6215*t)+(a)*Math.pow(v, b);
		System.out.println(w);
		}
		else
		{
			System.out.println("the value is out of range");
		}
		
	}


}
