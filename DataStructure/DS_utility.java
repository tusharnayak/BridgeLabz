


package com.Bridgelabz.DataStructure;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;

public class DS_utility<T>{
	 Node<T> first;
	//to add the item
	public  void add(T item)
	{
		Node<T> n=new Node<T>();
		n.data=item;
		n.next=null;
		Node<T> temp = first;
		
		if(first==null)
		{
		   first=n;	
		}
		else
		{
		   while(temp.next!=null)
		   {
			   temp=temp.next;
		   }
		   temp.next=n;
		}
		
	}
	
	
	//to remove the item
	public  void remove(T item)
	{
		Node<T> temp;
		Node<T> n1;
		
		if(first==null)
		{
			System.out.println("remove impossible");
			
		}
		else
		{
			temp=first;
			while(temp.next!=null)
			{
				if(temp.next.data.equals(item)) {
					n1 = temp.next;
					temp.next = n1.next;
				}
				//System.out.println("Inside Remove method :"+temp.data);
				temp=temp.next;
			}
			//temp=temp.next.next;
			}
	}
	
	
	//search your key
	public boolean search(T key)
	{
		Node<T> temp=first;
		while(temp.next!=null)
		{
			if(temp.data==(key))
			{
				//System.out.println("Data Found :"+key);
				remove(key);
				return true;
			}
			temp=temp.next;
		}
		if(temp.data==key)
		{
			return true;
		}
		add(key);
		return false;
		
		
		
}
	
	//check the file is empty or not
	public  boolean isEmpty()
	{
		if(first==null)
		{
			return true;
		}
		return false;
	}
	
	//check the size of the list
	public int size(Node<T> first)
	{
		int size=0;
		Node<T> temp=first;
		while(temp!=null)
		{
			size++;
			temp=temp.next;
		}
		return size;
	}
	
	//to add the data in last
	public  void append(T item)
	{
		Node<T> n=new Node<T>();
		n.data= item;
		n.next=null;
		Node<T> temp;
		temp=first;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
	//to check the index value
	public int index(T item)
	{
		Node<T> temp=first;
		int count=0;
		while(temp.next!=null)
		{
			if(temp.data.equals(item))
				return count;
			else {
				temp=temp.next;
				count++;
			}
				
		}
		return -1;
	}
	//to insert
	public  void insert(T item,int pos)
	{
		Node<T> n=new Node<T>();
		n.data=item;
		n.next=null;
		Node<T> temp=first;
		for(int i=0;i<pos-1;i++)
		{
		  	temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
	}
	public  Node<T> pop()
	{
		Node<T> temp=first;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		return temp;
	}
	public  Node<T> pop(int pos)
	{
		Node temp=first;
		for(int i=0;i<pos-1;i++)
		{
			temp=temp.next;
		}
		return temp=temp.next.next;
	}
	
	//to display the value
	public  String display() 
	{
		Node temp;
		String str="";
		if(first==null)
		{
			System.out.println("no items in the linkedlist");
		}
		/*else if(first.next==null)
		{
			System.out.println(first.data);
		}*/
		else
		{
			temp=first;
			while(temp.next!=null)
			{
				//str+=temp.data+" ";
				System.out.print(temp.data1+" ");
				
				temp=temp.next;

			}
			if(temp.next==null)
			{
				System.out.println(temp.data1);
			}
		}
		
		return str;
	}
	
	//for inserting element in appropriate position in the list
	public void insert(int data1)
	{
		Node n=new Node();
		n.data1=data1;
		n.next=null;
		
		if(first == null) {
			first = n;
		}
		else {
			Node node = first;
			while(node.next!=null) {
				node = node.next;
			}
			node.next = n;
		}
		
		/*if (first == null || first.data1 >= n.data1) {
			n.next = first;
			first = n;
		} else {
			temp = first;
			while (temp.next != null && temp.next.data1 < n.data1) {
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
		}*/
		
		
	}
	
	//BUbble sort for integer
	
	public static void bubbleSort(int arr[])
	{
	
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
	
	/*QUEUE ABSTRACT DATA TYPES
	-----------------------------*/
	Node front;
	Node rear;
	public void queue()
	{
		front=null;
		rear=null;
	}
	
	public void enqueue(int data1) //ADD DATA IN REAREND
	{
		Node<T> n=new Node<T>();
		n.data1=data1;
		n.next=null;
		if(rear==null)
		{
			front=n;
			rear=n;
		}
		else
		{
			rear.next=n;
			rear=n;
		}
	}
	public  Node<T> dequeue()//DELETE THE DATA FROM FRONT
	{
		Node<T> temp;
		if(front==null)
		{
			return null;
		}
		else
		{
		 temp=first;
		 first=first.next;
		}
		return temp;
	}
	public boolean isEmpty1()//TO CHECK THE QUEUE IS EMPTY OR NOT
	{
		if(rear==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int size()// TO CHECK THE SIZE OF THE QUEUE
	{
		int count=0;
		Node<T> temp;
		temp=front;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}

}
