package com.Bridgelabz.IOConcept;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("abc.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
	}

}
