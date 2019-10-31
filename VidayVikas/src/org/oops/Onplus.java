package org.oops;

import java.util.Scanner;

public class Onplus {
	public static PhoneBook[] getSortedData(PhoneBook phoneBook[])
	{
		PhoneBook ph[]=phoneBook;
		for(int i=0;i<ph.length;i++)
		{
			PhoneBook phi=ph[i];
			for(int j=i+1;j<ph.length-1;j++)
			{
				
				PhoneBook phj=ph[j];
				if(phi.getName().charAt(0)>phj.getName().charAt(0))
				{
					PhoneBook temp=phi;
					ph[i]=ph[j];
					ph[j]=temp;
					
				}
				
			}
		}
		return ph;
	}
public static void main(String[] args) {
	PhoneBook phBook[]=new PhoneBook[5];
	Scanner key=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter Name");
		String name=key.nextLine();
		System.out.println("Enter Phone Number");
		long number=Long.parseLong(key.nextLine());
		phBook[i]=new PhoneBook();
		phBook[i].setName(name);
		phBook[i].setNumber(number);
	}
	//
	System.out.println("---------Phone Book (Unsorted) -----");
	for(int i=0;i<5;i++)
	{
		System.out.println("Name:"+phBook[i].getName()+"\t Number:"+phBook[i].getNumber());
	}
	System.out.println("---------Phone Book (sorted) -----");
	PhoneBook sortedPhone[]=getSortedData(phBook);
	for(int i=0;i<5;i++)
	{
		System.out.println("Name:"+sortedPhone[i].getName()+"\t Number:"+sortedPhone[i].getNumber());
	}
}
}
