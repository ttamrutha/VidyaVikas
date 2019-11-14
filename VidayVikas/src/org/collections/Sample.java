package org.collections;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	int nos[]=new int[3];
	nos[0]=10;
	nos[1]=20;
	nos[2]=30;
	for(int i=0;i<3;i++)
	{
		System.out.println(nos[i]);
	}
	System.out.println("enter position to remove");
	Scanner key=new Scanner(System.in);
	int pos=key.nextInt();
	for(int i=pos;i<2;i++)
	{
		int t=nos[pos+1];
		nos[pos]=t;
	}
	nos[pos]=0;
	for(int i=0;i<3;i++)
	{
		System.out.println(nos[i]);
	}
}
}
