package org.exception;

import java.util.Scanner;

class MyError extends Exception
{
	String message="Input should Positive";
	public MyError() {
		// TODO Auto-generated constructor stub
	}
	public MyError(String message)
	{
		this.message=message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
}
public class ExampleOfCustom {
public static void main(String[] args) {
	 Scanner key=new Scanner(System.in);
	 System.out.println("Entere date of your birth");
	 int date=key.nextInt();
	
		try {
			 if(date<=0)
			throw new MyError("Date can't be a negative");
			 else
				 System.out.println("Date="+date);
		} catch (MyError e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
}
}
