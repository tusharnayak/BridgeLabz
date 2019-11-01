package com.Bridgelabz.Algorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("E:\\BridgeLabz\\BridgeLabz\\bridgelabz.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		String s1=null;
		while((str=br.readLine())!=null)
		{
			s1=str;
		}
		String arr[]=s1.split(",");
		System.out.println(Arrays.toString(arr));
		int i,j;
		String item;
		for(i=1;i<arr.length-1;i++)
		{
			item=arr[i];
			for(j=i-1;j>=0; j--)
			{
				if(arr[j].compareTo(item)>0)
				{
					arr[j+1]=arr[j];
			    }
				arr[j+1]=item;
			}
			
			System.out.print(arr[i]+" ");
		}
		
	}

}
