package org.oops;
class BaseCls
{
	public BaseCls() {
		// TODO Auto-generated constructor stub
		System.out.println("Base Class");
	}
	public BaseCls(int x) {
		// TODO Auto-generated constructor stub
		System.out.println("Base Class Parameter "+x);
	}
}

class ChildCls extends BaseCls
{
	public ChildCls() {
		// TODO Auto-generated constructor stub
		System.out.println("Child Class");
	}
	public ChildCls(int x)
	{
	System.out.println("Parameter Cons in Child Class "+x);	
	}
}
public class ConsEx {
public static void main(String[] args) {
//	ChildCls obj=new ChildCls();
	ChildCls obj2=new ChildCls(10);
	ChildCls obj3=(ChildCls) new BaseCls(10);
}

}
