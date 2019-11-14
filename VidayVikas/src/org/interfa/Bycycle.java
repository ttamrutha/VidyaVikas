package org.interfa;

public class Bycycle  implements Vehicle{

	public Bycycle() {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome to Bycycle...");
	}
	@Override
	public void speed(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Moving..... "+speed +" Speed");
	}

	@Override
	public void gear(int gn) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Moving..... "+gn +" Gear");
	}
	

}
