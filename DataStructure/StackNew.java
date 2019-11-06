package com.Bridgelabz.DataStructure;

public class StackNew<T> {
	
	int top;
	char[] ch=new char[200];
	public void push(char item)
	{
		ch[++top]=item;
	}
	public void pop()
	{
		if (top<=0)
			System.out.println("Stack is empty");
		
		else
			top--;
			char i = ch[top];
		
	}
	public char peek()
	{
		top--;
		char var = ch[top];
		top++;
		return var;
	}
	public boolean isEmpty()
	{
		if(top<=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int size()
	{
		return top;
	}
	
	
	
}
