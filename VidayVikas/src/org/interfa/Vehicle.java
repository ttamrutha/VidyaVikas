package org.interfa;

public interface Vehicle {
	public void speed(int speed);

	public void gear(int gn);

	default void disply(String name) {
		System.out.println("Welcome to " + name);
	}

	static void dis() {
		System.out.println("Inside 2");
	}
}
