package org.oops;

public class CalculateWord {
	private String sentence;
	private int count;

	public void assignValues(String s) {
		sentence = s;

	}
	public int  count_word() 
	{
		String splitDatas[]=sentence.split(" ");
		count=splitDatas.length;
		return count;
	}
}
