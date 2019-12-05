package org.thread;

public class Example3 {
public static void main(String[] args) {
	System.out.println("Welcome......");
	Thread t=null;
	t=new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				t.sleep(1000*3);
				System.out.println("Next Page");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	t.start();
}
}
