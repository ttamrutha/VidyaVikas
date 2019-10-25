package org.oops;

public class ClsJava {
public static void main(String[] args) {
	Attendence objDay1=Attendence.getInstance();
	objDay1.attend(101, "a", "Java");
	objDay1.attend(101, "a", "Java");
	objDay1.print();
	Attendence objDay2=Attendence.getInstance();
	objDay2.attend(101, "a", "Java");
	objDay2.print();
	Attendence objDayc1=Attendence.getInstance();
	objDayc1.attend(101, "a", "CPP");
	objDayc1.attend(101, "a", "CPP");
	objDayc1.print();
	Attendence objDayc2=Attendence.getInstance();
	objDayc2.attend(101, "a", "CPP");
	objDayc2.print();
}
}
