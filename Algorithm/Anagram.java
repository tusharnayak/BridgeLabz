package com.Bridgelabz.Algorithm;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="heart";
		String s2="earth";
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");
		if(s1.length()==s2.length())
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			s1=new String(ch1);
			s2=new String(ch2);
			if(s1.equals(s2))
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not a anagram");
			}
	    }
		else
		{
			System.out.println("not a anagram");
		}
		
	}

}
