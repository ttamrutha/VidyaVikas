package org.oops;

public class ClsCpp {
	public static void main(String[] args) {
	Attendence objDay1=Attendence.getInstance();
	objDay1.attend(101, "a", "CPP");
	objDay1.attend(101, "a", "CPP");
	objDay1.print();
	Attendence objDay2=Attendence.getInstance();
	objDay2.attend(101, "a", "CPP");
	objDay2.print();
	}
}
