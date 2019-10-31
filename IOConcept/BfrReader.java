package com.Bridgelabz.IOConcept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BfrReader {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("bridgelabz.txt");
		BufferedReader br=new BufferedReader(fr);
		String Line=br.readLine();
		while(Line!=null)
		{
			System.out.println(Line);
			Line=br.readLine();
		}
		br.close();
	}

}
