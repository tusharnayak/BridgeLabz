package com.Bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OrderedList {
	public static void main(String[] args) throws IOException {
		DS_utility<Integer> u=new DS_utility<Integer>();
		FileReader fr=new FileReader("E:\\BridgeLabz\\BridgeLabz\\number1.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		String s="";
		while((str=br.readLine())!=null)
		{
			s=str;
		}
		
		
		String[] arr=s.split(" ");//to split the string array
		
		int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr2[i] = Integer.parseInt(arr[i]); 
		}
		System.out.println(Arrays.toString(arr2));
		u.bubbleSort(arr2);//to arrange the data in ascending order
		
		for (int i : arr2) { //for adding the element to the linkedList
			u.insert(i);
			}
		System.out.println();
		u.display();
		
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number you want to search");
		int num=scan.nextInt();
		u.search(num);
		s=u.display();
		BufferedWriter bf=new BufferedWriter(new FileWriter("E:\\BridgeLabz\\BridgeLabz\\number1.txt"));
		bf.write(s+" ");
		bf.flush();
		bf.close();
		
		
		
		
		
	}

}
