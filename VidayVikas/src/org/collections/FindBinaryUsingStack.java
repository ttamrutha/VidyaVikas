package org.collections;

import java.util.Stack;

public class FindBinaryUsingStack {
public static void main(String[] args) {
	int n=5;
	Stack<Integer> binary=new Stack<>();
	String  binaryVal = "";
	int count=0;
	while(n!=0)
	{
		System.out.println("Inside Loop");
		int rem=n%2;
		binary.push(rem);
		n=n/2;
		count++;
	}
	for(int i=0;i<count;i++)
	{
		binaryVal+=binary.pop();
	}
	System.out.println(" 10 Binary Value = "+binaryVal);
}
}
