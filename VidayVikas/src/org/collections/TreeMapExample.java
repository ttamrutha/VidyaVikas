package org.collections;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "M1");
		map.put(3, "M2");
		map.put(2, "M3");
		System.out.println(map);
		System.out.println(((TreeMap<Integer, String>) map).lowerKey(3));
		System.out.println(((TreeMap<Integer, String>) map).higherKey(2));
		System.out.println(((TreeMap<Integer, String>) map).floorEntry(3));
		Map<Integer, Integer> map1 = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				// TODO Auto-generated method stub
				return (x > y) ? -1 : ((x == y) ? 0 : 1);
			}
		});
		map1.put(1, 2);
		map1.put(3, 22);
		map1.put(2, 83);
		System.out.println(map1);
	}
}
