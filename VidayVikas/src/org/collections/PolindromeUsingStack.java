package org.collections;

import java.util.Stack;

public class PolindromeUsingStack {
public static void main(String[] args) {
	String word="wow";
	String rev="";
	Stack<Character> words=new Stack<>();
		for(int i=0;i<word.length();i++)
		{
			words.push(word.charAt(i));
		}
		//System.out.println(words.peek());
		for(int i=0;i<word.length();i++)
		{
			rev+=words.pop();
		}
		//System.out.println(rev);
		if(word.equals(rev)) {
			System.out.println("Given string is polindrome");
		}
		else
		{
			System.out.println("Not a Polindrome...");
		}
}
}
