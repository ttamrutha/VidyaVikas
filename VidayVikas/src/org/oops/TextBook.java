package org.oops;

import java.util.Scanner;

public class TextBook {
public static void main(String[] args) {
	Scanner key=new Scanner(System.in);
	System.out.println("Enter Book Name");
	String bn=key.nextLine();
	System.out.println("Enter Book Price");
	int bp=Integer.parseInt(key.nextLine());
	System.out.println("Enter Author Name");
	String an=key.nextLine();
	//Book obj=new Book(bn,bp,an);
	Book obj=new Book();
	obj.setBookName(bn);
	obj.setBookPrice(bp);
	obj.setAuthorName(an);
	//obj.print();
	System.out.println(obj);
	System.out.println("Enter Book Name");
	String bn1=key.nextLine();
	System.out.println("Enter Book Price");
	int bp1=Integer.parseInt(key.nextLine());
	System.out.println("Enter Author Name");
	String an1=key.nextLine();
	/*Book obj1=new Book(bn1,bp1,an1);
	System.out.println(obj1);*/
	
}
}
