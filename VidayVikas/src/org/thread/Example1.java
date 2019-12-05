package org.thread;
class Ex  implements Runnable
{
	Thread t;
	public Ex() {
		// TODO Auto-generated constructor stub
		t=new Thread(this);
		t.setPriority(10);
		t.setName("T1");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{if(i==3)
		{
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			System.out.println(t.getName());
			System.out.println("ExClass="+i);
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Example1 {
public static void main(String[] args) {
	Ex obj=new Ex();
	for(int i=1;i<=10;i++)
	{
		
		System.out.println("Main:"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
