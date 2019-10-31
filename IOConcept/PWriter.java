package com.Bridgelabz.IOConcept;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PWriter {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("home.txt");
		pw.write(100);
		pw.println(true);
		pw.println("come to office properly");
		pw.println('x');
		pw.flush();
		pw.close();
	}

}
