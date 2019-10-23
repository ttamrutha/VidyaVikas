package org.Util;

public class WordCount {
	public static void main(String[] args) {
		String sentence = "ZoomIt is a screen zoom and annotation tool for technical presentations that include application demonstrations. ZoomIt runs unobtrusively in the tray and activates with customizable hotkeys to zoom in on an area of the screen, move around while zoomed, and draw on the zoomed image. I wrote ZoomIt to fit my specific needs and use it in all my presentations.";
		String splitDats[]=sentence.split(" ");
		System.out.println(splitDats.length);
	}
}
