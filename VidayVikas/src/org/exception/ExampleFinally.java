package org.exception;

import java.util.Scanner;

public class ExampleFinally {
public static void main(String[] args) {
	int a=10, b=10;
	int lukyNo;
    try
    {
    	Scanner key=new Scanner(System.in);
    	lukyNo=key.nextInt();
    	System.out.println("Luck No:"+lukyNo);
    	int c=a/b;
    	String ar[]=new String[3];
    	ar[0]="Amrutha";
    	ar[1]="Abhi";
    	ar[2]="Sahana";
    	int r=ExampleOfArray.getRandomNumber();
    	String data=ar[r];
    	
    	//System.exit(0);
    }
   
    catch (ArithmeticException e) {
		// TODO: handle exception
    	System.out.println(e.getMessage());
	}
    catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
    	System.out.println(e.getMessage());
	}
    catch(Exception e)
    {
    	e.printStackTrace();
    }
    finally {
	lukyNo=0;
	}
}


}
