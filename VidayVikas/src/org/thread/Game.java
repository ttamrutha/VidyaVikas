package org.thread;
class User extends Thread
{
	Thread t;

	public User() {
		// TODO Auto-generated constructor stub
		 t=new Thread(this);
		t.setName("User");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				try {
					t.join(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i+" Round Completed ");
		}
	}
}
public class Game {
public static void main(String[] args) {
	//System.out.println(Thread.currentThread().getName());
	User obj=new User();
	
	for(int i=1;i<=10;i++)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+":"+i+" Round Completed");
	}
}
}
