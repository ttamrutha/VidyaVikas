package org.oops;

import java.util.Scanner;

public class ContactManager {
public static void main(String[] args) {
	Contact contact[]=new Contact[3];
	contact[0]=new Contact();
	contact[0].add("a", 1, "ae");
	contact[1]=new Contact();
	contact[1].add("s", 12, "se");
	contact[2]=new Contact();
	contact[2].add("ss", 123, "sse");
	String result=contact[0].search(1);
	System.out.println(result);
	/*
	  Scanner key=new Scanner(System.in);
	String result=null;
	
	 while(true)
	{
		System.out.println("1.Add 2. By Name 3 By Number 4 By number and Email ");
		int ch=Integer.parseInt(key.nextLine());
		if(ch==1)
		{
			System.out.println("Enter Name");
			String name=key.nextLine();
			System.out.println("Enter Phone Number");
			long number=Long.parseLong(key.nextLine());
			System.out.println("Enter Email Id");
			String email=key.nextLine();
			contact.add(name, number, email);
		}
		else if(ch==2)
		{
			System.out.println("Enter Name");
			String name=key.nextLine();
			result=contact.search(name);
			System.out.println(result);
		}
		else if(ch==3)
		{
			System.out.println("Enter Phone Number");
			long number=Long.parseLong(key.nextLine());
			result=contact.search(number);
			System.out.println(result);
		}
		else if(ch==4)
		{
			System.out.println("Enter Phone Number");
			long number=Long.parseLong(key.nextLine());
			System.out.println("Enter Email Id");
			String email=key.nextLine();
			result=contact.search(number, email);
			System.out.println(result);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}*/
}
}
