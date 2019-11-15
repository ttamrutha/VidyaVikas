package org.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckPlagarism {
	public static List<String> addSentence(String sentence)
	{
		String splitData[]=sentence.split(" ");
		List<String> sList1=new ArrayList<>();
		sList1=Arrays.asList(splitData);
		return sList1;
	}
public static void main(String[] args) {
	/*String s1="The project proposal should contain complete details in the following format";
	String s2="The title itself gives a peep into the project to be taken up, candidate is";*/
	String s1="1 6 3 4";
	String s2="1 2 5 4";
	List<String> s1List=new ArrayList<>(addSentence(s1));
	List<String> s2List=new ArrayList<>(addSentence(s2));
	List<String> retainList=new ArrayList<>(s1List);
	//List<String> removeList=new ArrayList<>(s2List);
	//System.out.println(s2List.toString());
	retainList.retainAll(s2List);
	//removeList.removeAll(new ArrayList<>(retainList));
	int per=retainList.size()*100/s1List.size();
	System.out.println(s2List.toString());
	System.out.println("Per:" +per+"%");
}
}
