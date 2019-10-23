package org.Util;
import java.util.Scanner;
public class ExampleScanner {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter your Age");
	int age=obj.nextInt();
	//obj.nextLine();
	System.out.println("Enter Your name");
	String name=obj.nextLine();
	System.out.println("Entred Name="+name);
	System.out.println("your AGe"+age);

}
}
