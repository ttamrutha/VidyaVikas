package org.Util;

public class ExampleofArrays {
public static void main(String[] args) {
	int numbers[]=new int[10];
	String names[]=new String[2];
	int even[]= {2,4,6,8,10};
	int fecthSize=even.length;
	int SE=5;
	boolean flag=false;
	for(int i=0;i<fecthSize;i++)
	{
		if(even[i]==SE)
		{
			flag=true;
			break;
		}
	}
	if(flag)
	{
		System.out.println("Found ");
	}
	else
	{
		System.out.println("Not Found ");
	}
}
}
