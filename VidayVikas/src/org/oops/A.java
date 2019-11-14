package org.oops;

import java.util.Scanner;

class A {
	int x;

	public static void main(String[] args) {
		int m[] = new int[10];
		int s = 0;
		Scanner key = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter Cell");
			m[i] = key.nextInt();

		}
		for (int i = 0; i < 10; i++) {
			if (m[i] % 3 == 0 || m[i] % 5 == 0) {
				s = s + m[i];
			}
		}
		System.out.println("Sum=" + s);
	}
}
