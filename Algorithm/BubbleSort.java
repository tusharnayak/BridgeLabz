package com.Bridgelabz.Algorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args)  {
		int[] arr= {75,25,50,77,19,98,100};
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		
	}

}
