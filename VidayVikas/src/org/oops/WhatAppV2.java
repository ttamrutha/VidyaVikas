package org.oops;

public class WhatAppV2 extends WhatsAppV1 {
	@Override
	public void tick(int n) {
		// TODO Auto-generated method stub
		super.tick(n);
		
			if(n>10)
			{
				System.out.println("Seen..");
			}
	}
	public void videoCall()
	{
		System.out.println("Video Call");
	}
public void voiceMessage()
{
	System.out.println("Voice Message...");
}
}
