package com.Bridgelabz.DataStructure;

import java.util.Stack;

import org.junit.jupiter.engine.script.ScriptAccessor.SystemPropertyAccessor;
public class BalanceParentheses {
	static StackNew<String> st=new StackNew<String>();
	public static void main(String[] args) {
		String str= "(5+6)*(7+8)/(4+3)*(5+6)*(7+8)/(4+3)";
		char item;
		for(int i=0;i<str.length();i++)
		{
			item = str.charAt(i);
			if(item=='(')
			{
				//System.out.println("m");
				st.push(item);
			}
			else if(item==')')
			{
				//System.out.println("m");
				st.pop();
			}
		}
		if(st.isEmpty())
		{
			
			System.out.println("balanced");
		}
		else
		{
			System.out.println("not balanced");
		}
	}
}
