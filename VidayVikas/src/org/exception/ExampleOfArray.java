package org.exception;

import java.util.Random;
import java.util.Scanner;

public class ExampleOfArray {
	
	public static int getRandomNumber()
	{
		
		Random random=new Random();
		return random.nextInt(10);
	}
public static void main(String[] args) {
	String ar[]=new String[3];
	ar[0]="Amrutha";
	ar[1]="Abhi";
	ar[2]="Sahana";
	int r=getRandomNumber();
	
	try
	{
		String data=ar[r];
		System.out.println(data);
		Scanner key=new Scanner(System.in);
		System.out.println("Enter a num");
		int a=key.nextInt();
		System.out.println("Enter a num");
		int b=key.nextInt();
		int c=0;
		try
		{
		c=a/b;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			//System.out.println("Error accured");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		e.printStackTrace();
		
	}
	System.out.println("EndLine");
}
}
