package com.Bridgelabz.Algorithm;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomizedMessege {
	public static void main(String[] args) {
		String str1="Hello <<name>>";
		String str2="We have your full as <<full name>>";
		String str3="your contact number is 91-xxxxxxxxxx";
		String str4="please letus know for any clarification,thank you Bridgelabz <<01/01/2019>>";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first your name");
		String str5=scan.nextLine();
		System.out.println("enter your last name");
		String str6=scan.nextLine();
		String str7=str5+str6;
		System.out.println("enter your phone number");
		String str8=scan.nextLine();
		LocalDate localDate=java.time.LocalDate.now();
		
		
		System.out.println(str1.replaceAll("<<name>>", str5));
		System.out.println(str2.replaceAll("<<full name>>", str7));
		System.out.println(str3.replaceAll("91-xxxxxxxxxx", str8));
		System.out.println(str4.replaceAll("<<01/01/2019>>", "01/11/2019"));
	}

}
