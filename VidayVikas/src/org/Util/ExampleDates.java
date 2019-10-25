package org.Util;

import java.util.Calendar;
import java.util.Date;

public class ExampleDates {
public static void main(String[] args) {
	Date d1=new Date();
	String da="02/10/2019";
	Date d2=new Date(da);
	 long diff = d1.getTime() - d2.getTime();
	 System.out.println(diff);
	 //int mod=10000%60;
     long diffSeconds = diff / 1000 % 60;
     long diffMinutes = diff / (60 * 1000) % 60;
     long diffHours = diff / (60 * 60 * 1000);
     int diffInDays = (int) ((d1.getTime() - d2.getTime()) / (1000 * 60 * 60 * 24));
     
     Calendar calendar=Calendar.getInstance();
     System.out.println(calendar.get(Calendar.YEAR));
     System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
     System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
     System.out.println(calendar.get(Calendar.AM_PM));
     System.out.println("Seconds="+diffSeconds);
     
}
}
