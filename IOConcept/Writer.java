package com.Bridgelabz.IOConcept;

import java.io.FileWriter;
import java.io.IOException;
public class Writer {
	public static void main(String[] args) throws IOException{
	FileWriter fw=new FileWriter("abc.txt");
	 fw.write(100);
	 fw.write("urga\nSoftwareSolution\n");
	 char[] ch= {'a','b','c','d'};
	 fw.write(ch);
	 fw.write("\n");
	 fw.flush();
	 fw.close();
	}
	 

}
