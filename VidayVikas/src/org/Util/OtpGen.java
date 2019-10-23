package org.Util;

import java.util.Random;

public class OtpGen {
public static void main(String[] args) {
	String otp="";
	Random r=new Random();
	/*for(int i=0;i<4;i++)
	{
		otp+=r.nextInt(10);
	}*/
/*	int otp1=r.nextInt(1000)+1000;
	System.out.println("Generated Otp ="+otp1);*/
	for(int i=0;i<2;i++)
	{
		otp+=r.nextInt(10);
		for(int j=0;j<1;j++)
		{
			char ch=(char) (r.nextInt(26)+65);
			otp+=ch;
		}
	}
	System.out.println("Generated Otp ="+otp);
}
}
