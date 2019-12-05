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
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void Problem() throws InterruptedException {
		System.out.println("Problem Occured...");
		t.suspend();
	}
	public void problemResolved() throws InterruptedException
	{
		System.out.println("Problem Resolved...");
		t.resume();
	}
}
public class CarGame {
public static void main(String[] args) {
	Car obj=new Car();
	Random r=new Random();
	
	while(true)
	{
		int num=r.nextInt(10);
		System.out.println("R:"+num);
	if(num%2==0)
	{
		try {
			obj.Problem();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	else 
	{
		try {
			obj.problemResolved();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
