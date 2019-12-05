package org.thread;
class Print extends Thread
{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<500;i++)
		{
			Thread.yield();
			System.out.println("i1="+i);
			
		}
	}
}

class Print3 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			

			System.out.println("\t\ti3="+i);
			
		}
	}
}
public class Exampleyiled {
public static void main(String[] args) {
	Print p1=new Print();
	Print3 p3=new Print3();
	p1.start();
	p3.start();
	
	
}
}
