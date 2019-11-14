package org.interfa;

public class Dio implements Vehicle {

	public Dio() {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome to DIO");
	}

	@Override
	public void speed(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Moving..... " + speed + " Speed");
	}

	@Override
	public void gear(int gn) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Moving..... " + gn + " Gear");
	}

}
