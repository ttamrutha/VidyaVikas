package org.collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class ExampleOfHashTable {
public static void main(String[] args) {
	HashMap<String, String>hash=new HashMap<>();
	hash.put(null, null);
	hash.put(null, null);
	System.out.println(hash.toString());
	Hashtable<String, String> Conatact=new Hashtable<>();
	//Conatact.put(null, null);
	Conatact.put("Amrutha", "44586487");
	Conatact.put("Amrutha", "1111");
	Conatact.put("Shilpa", "453434");
	Conatact.put("Shambhavi", "46534765");
	System.out.println(Conatact.get("Amrutha"));
	System.out.println(Conatact.toString());
	//Conatact.remove("Amrutha");
	//System.out.println(Conatact.toString());
	System.out.println(Conatact.containsKey("Amrutha"));
	System.out.println(Conatact.containsValue("453434"));
	Enumeration<String> e=Conatact.keys();
	while(e.hasMoreElements())
	{
		String keyName=e.nextElement();
		System.out.println("Key="+keyName);
		System.out.println("Values="+Conatact.get(keyName));
	}
}
}
