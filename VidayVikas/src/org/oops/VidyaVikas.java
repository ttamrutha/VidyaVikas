package org.oops;

import java.util.Random;

public class VidyaVikas extends University {

	public VidyaVikas() {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome to Vidya Vikas...");

	}
	@Override
	public int admision(String studentName, int sem, int year) {
		// TODO Auto-generated method stub
		if(studentName.length()>4&& sem<=8&& year==2019)
		{
			Random r=new Random();
			int usn=r.nextInt(1000)+1000;
			return usn;
		}
		return 0;
	}

	@Override
	public void fee(int usn, int fee) {
		// TODO Auto-generated method stub
		if(usn>1000&&fee>10000)
		{
			System.out.println("Sucessfully Paid...");
		}
		else
		{
			System.out.println("Fail to pay fee");
		}
	}

	
	

}
