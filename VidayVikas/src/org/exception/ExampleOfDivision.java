package org.exception;

import java.util.Scanner;

public class ExampleOfDivision {
public static void main(String[] args) {
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
	System.out.println("Result="+c);
}
}
