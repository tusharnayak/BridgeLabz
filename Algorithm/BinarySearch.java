package com.Bridgelabz.Algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) throws Exception
	   {
		FileReader fr=new FileReader("E:\\BridgeLabz\\BridgeLabz\\bridgelabz.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		String s = null;
		while((str=br.readLine())!=null)
		{
			s = str;
		}
		String arr [] = s.split(",");
		int len = arr.length;
		for(int i = 0; i<len; i++) {
	         for (int j = i+1; j<len; j++) {
	            if(arr[i].compareTo(arr[j])>0) {
	               String temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
		}
		System.out.println(Arrays.toString(arr));
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the word");
		String word=scan.nextLine();
		int lo=0;
		int hi=len-1;
		int mi =0;
		while(lo<=hi)
		{
			mi=(lo+hi)/2;
			if(arr[mi].equals(word))	
			{
				System.out.println("the word present in "+mi+" index number");
				break;
			}
			else if((arr[mi].compareTo(word))<0)
			{
				lo= mi+1;
			}
			else
			{
				hi=mi;
			}
			
		}
		
		
	 }
}
