package com.Bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class UnOrderedList {
	public static void main(String[] args) throws IOException {
		DS_utility<String> list=new DS_utility<String>();
		FileReader fr=new FileReader("E:\\BridgeLabz\\BridgeLabz\\Unorder.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		String s="";
    	while((str=br.readLine())!=null)
		{
			s=str+" ";
	    }
    	for (String st : s.split(" ")) {
		  list.add(st);
		}
		System.out.println("After inserting in lists");
		System.out.print(s+" ");
		System.out.println();
		System.out.println("enter the word you want to search from the list");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		list.search(s1);
		s=list.display();
		//System.out.print("Final List :"+s+" ");
		BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\BridgeLabz\\BridgeLabz\\Unorder.txt"));
		writer.write(s+" ");
		writer.close();
		
	}
}

