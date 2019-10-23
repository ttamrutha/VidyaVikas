package org.Util;

import java.util.Random;

public class LuckDip {
public static void main(String[] args) {
	String names[]= {"a","b","c","d","e","f","g"};
	Random r=new Random();
	int luckyPer=r.nextInt(names.length);
	System.out.println("Winner is ="+names[luckyPer]);
}
}
