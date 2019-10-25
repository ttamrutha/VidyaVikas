package org.oops;

import java.util.Calendar;
import java.util.Date;

public class ExampleFindWords {
public static void main(String[] args) {
	//Date d=new Date();
/*	Calendar c=Calendar.getInstance();
	c.set(2019, 10, 11);
	System.out.println(c.get(Calendar.DAY_OF_MONTH));*/
	CalculateWord word=new CalculateWord();
	String sentence = "ZoomIt is a screen zoom and annotation tool for technical presentations that include application demonstrations. ZoomIt runs unobtrusively in the tray and activates with customizable hotkeys to zoom in on an area of the screen, move around while zoomed, and draw on the zoomed image. I wrote ZoomIt to fit my specific needs and use it in all my presentations.";
	word.assignValues(sentence);
	int count=word.count_word();
	System.out.println(count);
}
}
