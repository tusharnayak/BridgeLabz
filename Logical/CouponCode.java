package com.Bridgelabz.Logical;

import java.util.Scanner;

public class CouponCode {
	public static void main(String[] args)
	{
	char ch[]="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

	long MAXVALUE=1000000000l;//Long.MAX_VALUE;
	int random=(int)(Math.random()*MAXVALUE);
	StringBuffer sb=new StringBuffer();
	while(random>0)
	{
	sb.append(ch[random%ch.length]);
	random =random/ch.length;
	}
	String couponCode=sb.toString();
	System.out.println("Coupon Code: "+couponCode);
	}
}
