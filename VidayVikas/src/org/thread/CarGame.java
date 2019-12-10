package org.thread;

import java.util.Random;

class Car implements Runnable
{
	Thread t;
	public Car() {
		// TODO Auto-generated constructor stub
	t=new Thread(this);
	t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			System.out.println("User Car\t"+i);
			if(i==3)
			{
				
					Problem();
				
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void Problem()  {
		System.out.println("Problem Occured...");
		try {
			t.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void problemResolved()  
	{
		System.out.println("Problem Resolved...");
		t.notify();
	}
}
public class CarGame {
public static void main(String[] args) {
	Car obj=new Car();

}
}
