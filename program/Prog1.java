package com.Bridgelabz.program;

import java.util.Scanner;

public class Prog1 {
	public static void main(String[] args) {
		String str="Hello <<UserName>>, How are you?";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a name");
		String x=scan.nextLine();
		System.out.println(str.replace("<<UserName>>", x));
		}

}
