package org.collections;

import java.util.Arrays;

public class MatchShoes {
public static void main(String[] args) {
	int shoes[]= {10,20, 20, 10, 10, 30, 50, 10, 20};
	int count = 0;
	Arrays.sort(shoes);
	for(int i=0;i<shoes.length-1;i++)
	{
		
	
		
			if(shoes[i]==shoes[i+1])
			{
				count++;
				i++;
			}
		
	}
	System.out.println(count);
}
}
