package org.oops;

import java.util.Random;

public class WhatsAppV1 {
	
	long number;

	public long getNumber() {
		return number;
	}

	
	public void setNumber(long number) {
		this.number = number;
	}
	public void register() {
		
		System.out.println("Hello Sucessfully "+getNumber()+" Registered...");
	}
	public void chat(String message)
	{
		//System.out.println("Chat Here.....");
		
		System.out.println("Sucessfully "+message+" Sent...");

		
	}
	public void broadCast()
	{
		System.out.println("You can create broadCast here...");
	}
	public void tick(int n)
	{
		if(n%2==0)
		{
			System.out.println("Sucessfully Delivered");
		}
		else
		{
			System.out.println("Not Yet...");
		}
	}

}
