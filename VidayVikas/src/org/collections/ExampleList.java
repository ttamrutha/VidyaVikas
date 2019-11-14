package org.collections;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {
public static void main(String[] args) {
	List<Integer> nos=new ArrayList<>();
	Integer n1=new Integer(10);
	nos.add(n1);
	nos.add(new Integer(20));
	System.out.println(nos.get(1));
	nos.add(1,30);
	//nos.remove(1);
	System.out.println(nos.toString());
	System.out.println(nos.contains(30));
	System.out.println(nos.indexOf(20));
}
}
