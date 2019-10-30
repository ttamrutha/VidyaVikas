package org.oops;
class Demo 
{
	public Demo()
	{
		System.out.println("Constractor Called");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello String Here ";
	}
}
public class ExampleConstructor {
public static void main(String[] args) {
	Demo obj;
	obj=new Demo();
	System.out.println(obj);
}
}
