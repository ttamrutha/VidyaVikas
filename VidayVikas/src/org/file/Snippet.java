package org.file;

import java.util.Calendar;

public class Snippet {
	  public static void main(String[] args) {
		  Calendar cal = Calendar.getInstance();
	        int day = cal.get( Calendar.DAY_OF_MONTH);
	        
	        int wd =cal.get( Calendar.DAY_OF_WEEK);
	        int wm = cal.get( Calendar.WEEK_OF_MONTH);
	        System.out.println("Day"+day);
	        System.out.println("Wd "+wd);
	        System.out.println("Week of Month:"+wm);
	}
	        
}

