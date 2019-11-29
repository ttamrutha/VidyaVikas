package org.arrays;

import java.util.Scanner;

public class TwoDemi {
public static void main(String[] args) {
	int marks[][]=new int[3][4];
	int max=0;
	int min=0;
	int sum=0;
	
	/*marks[0][0]=1;
	marks[0][1]=67;
	marks[0][2]=91;
	marks[0][3]=61;
	marks[1][0]=2;
	marks[1][1]=47;
	marks[1][2]=91;
	marks[1][3]=31;
	marks[2][0]=3;
	marks[2][1]=87;
	marks[2][2]=91;
	marks[2][3]=66;*/
	//System.out.println(marks[1][3]);
	Scanner key=new Scanner(System.in);
	
	for(int i=0;i<2;i++)
	{
		System.out.println("Enter a class ");
		int cls=key.nextInt();
		marks[i][0]=cls;
		
		for(int j=1;j<2;j++)
		{
			System.out.println("Enter a marks");
			int mark=key.nextInt();
			marks[i][j]=mark;
			
			
		}
		
	}
	min=marks[0][0];
	max=marks[0][0];
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(marks[i][j]+"\t");
			if(marks[i][j]<min)
			{
				min=marks[i][j];
			}
			if(marks[i][j]>max)
			{
				max=marks[i][j];
			}
			sum+=marks[i][j];
			

		}
		System.out.print("Row ="+sum);
		sum=0;
		System.out.println();
	}
	System.out.println("Total marks Obatained="+sum);
	System.out.println("Max "+max);
	System.out.println("min "+min);
}
}
