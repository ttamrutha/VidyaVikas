package org.Util;

import org.oops.Book;

class book
{
	private String bookName;
	private String author;
	public book(String bname,String aname) {
		// TODO Auto-generated constructor stub
		bookName=bname;
		author=aname;
	}
	
	public void print()
	{
		System.out.println("Book Name "+bookName);
		System.out.println("Book Author "+author);
	}
}
public class TextBook {
public static void main(String[] args) {
	book ob=new book("b1","ar");
	ob.print();
}
}
