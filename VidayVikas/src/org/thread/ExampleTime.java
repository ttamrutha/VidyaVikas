package org.thread;

import java.util.Calendar;

class USA implements Runnable
{
	Thread t;
	Calendar c;
	int hour,min,sec=1;
	public USA(int hour,int min) {
		// TODO Auto-generated constructor stub
		t=new Thread(this);
		this.hour=hour;
		this.min=min;
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			
			System.out.println("USA"+hour+":"+min+":"+sec);
			try {
				t.sleep(1000);
				sec++;
				if(sec==60)
				{
					sec=1;
					min++;
				}
				if(min==60)
					hour++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Aus implements Runnable
{
	Thread t1;
	Calendar c;
	public Aus() {
		// TODO Auto-generated constructor stub
		t1=new Thread(this);
		 c=Calendar.getInstance();
			c.set(Calendar.HOUR, 11);
			c.set(Calendar.MINUTE, 20);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("AUS:"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE));
			try {
				t1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ExampleTime {
public static void main(String[] args) {
	USA obj=new USA(10,20);
	Aus obj1=new Aus();
}
}
