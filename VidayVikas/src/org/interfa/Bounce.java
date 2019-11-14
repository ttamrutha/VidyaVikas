package org.interfa;

import java.util.Scanner;

public class Bounce {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Vehicle obj;
		System.out.println("1. Cycle 2 Dio");
		int ch = key.nextInt();
		if (ch == 1) {
			obj = new Bycycle();
		} else {
			obj = new Dio();
		}
		obj.speed(30);
		obj.gear(3);
		obj.disply("Amrutha");
		Vehicle.dis();
	}
}
