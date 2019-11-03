package org.oops;

import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	University obj;
	Scanner key=new Scanner(System.in);
	while(true)
	{
		System.out.println("1.Vidya Vikas 2 VidyaVardaka");
		int ch=key.nextInt();
		if(ch==1)
		{
			obj=new VidyaVikas();
		}
		else
		{
			obj=new VidyaVardaka();
		}
		int usn=obj.admision("Amrutha", 4, 2019);
		//System.out.println(usn);
		obj.fee(usn, 12000);
	}
}
}
