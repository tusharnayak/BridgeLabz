package com.Bridgelabz.IOConcept;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BfrWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("bridgelabz.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(97);
		bw.newLine();
		bw.write("silk city bangalore");
		bw.newLine();
		char[] ch= {'t','u','s','h','a','r'};
		bw.write(ch);
		
		bw.flush();
		bw.close();
	}
	

}
