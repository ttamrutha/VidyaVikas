package org.exception;
class Divide
{
	public int divide(int a,int b) throws Exception
	{
		return a/b;
		
	}
}
public class ExampleOfThrows {
public static void main(String[] args) {
	Divide obj=new Divide();
	
	try {
		int res=obj.divide(10,70);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("End Line");
}
}
