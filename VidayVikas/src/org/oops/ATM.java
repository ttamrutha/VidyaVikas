package org.oops;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	static int randomNum() {
		Random r=new Random();
		return r.nextInt(10);
	}
public static void main(String[] args) {
	Scanner key=new Scanner(System.in);
	RBI obj;
	while(true)
	{
		
		if(randomNum()%2==0)
		{
			obj=new SBI();
		}
		else
		{
			obj=new Karnataka();
		}
		System.out.println("1. Deposite 2.Withdraw");
		int ch=key.nextInt();
		if(ch==1)
		{
			System.out.println("Enter Deposite Amount ");
			obj.deposite(key.nextInt());
		}
		else
		{
			System.out.println("Enter Withdraw  Amount ");
			obj.withdraw(key.nextInt());
		}
	}
}
}
