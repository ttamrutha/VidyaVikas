package org.collections;

import java.util.Hashtable;
import java.util.Scanner;

public class AutoCompleteUsingHashT {
public static void main(String[] args) {
	Details obj=new Details();
	obj.setAddress("Mysuru");
	obj.setCountry("India");
	obj.setState("KA");
	obj.setMobile(454645645);
	obj.setEmail("amru@gmail.com");
	Details obj1=new Details();
	obj1.setAddress("Bangalore");
	obj1.setCountry("India");
	obj1.setState("KA");
	obj1.setMobile(3253445);
	obj1.setEmail("sa@gmail.com");
	Hashtable<String, Details> auto=new Hashtable<>();
	auto.put("Amrutha", obj);
	auto.put("Sahana", obj1);
	Scanner key=new Scanner(System.in);
	System.out.println("Enter yout Name");
	String name=key.nextLine();
	if(auto.containsKey(name));
	{
		Details ob=auto.get(name);
		System.out.println("Your Details......");
		System.out.println("Email:"+ob.getEmail());
		System.out.println("MobileNo:"+ob.getMobile());
		System.out.println("Address:"+ob.getAddress());
		System.out.println("State:"+ob.getState());
		System.out.println("Country:"+ob.getCountry());
	}
	
	}
}
