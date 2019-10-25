package org.oops;

public class Attendence {
int studentId;
String studentName;
String className;
 int totalNumberAttendance=0;
 public static Attendence attendence=null;
 private  Attendence()
 {
	 System.out.println("CC ");
 }
 public static Attendence getInstance()
 {
	 if(attendence==null)
	 {
		 attendence=new Attendence();
	 }
	 return attendence;
 }
 
public void attend(int id,String name,String cls)
{
	studentId=id;
	studentName=name;
	className=cls;
	if(id==101&name.equals("a"))
	{
	
		totalNumberAttendance++;
		
	}
	
}
public void print()
{
	System.out.println("Name:"+studentName+" Id:"+studentId+" ClassName:"+className);
	System.out.println("Total Numberof Attendence="+totalNumberAttendance);
}
}
