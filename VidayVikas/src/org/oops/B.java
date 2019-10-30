package org.oops;
class AA
{
	public AA() {
		// TODO Auto-generated constructor stub
		System.out.println("Class A");
	}
	public AA(int x)
	{
		System.out.println("X Value AA "+x);
	}
}
class C extends AA
{
	public C() {
		// TODO Auto-generated constructor stub
		System.out.println("C");
	}
	public C(int x)
	{
		System.out.println("X Value C "+x);
	}
}
public class B {
public static void main(String[] args) {
	//C obj=new C();
	C obj1=new C(10);
	
}
}
