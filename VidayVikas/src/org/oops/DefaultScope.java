package org.oops;

public class DefaultScope {
public static void main(String[] args) {
	A obj=new A();
	obj.x=10;
	System.out.println(new DefaultScope().hashCode());
	System.out.println(new DefaultScope().hashCode());
}
}
