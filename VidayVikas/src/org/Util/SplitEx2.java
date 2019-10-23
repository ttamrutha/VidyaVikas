package org.Util;

import java.util.Scanner;

public class SplitEx2 {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter your Name");
	String name=obj.nextLine();
	System.out.println("Enter your DOB (dd/MM/yyyy)");
	String dob=obj.nextLine();
	int year=Integer.parseInt(dob.split("/")[2]);
	int age=2019-year;
	if(age>=18)
	{
		System.out.println("Eligiable");
	}
	else
	{
		System.out.println("Not Eligiable becz your age("+age+") is less than 18");
	}
}
}
