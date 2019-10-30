package org.oops;

public class Book {
private String bookName;
private int bookPrice;
private String authorName;

public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookPrice() {
	return bookPrice;
}
public void setBookPrice(int bookPrice) {
	this.bookPrice = bookPrice;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public Book() {
	// TODO Auto-generated constructor stub
}
/*public Book(String bName,int bPrice,String aName)
{
	bookName=bName;
	bookPrice=bPrice;
	authorName=aName;
}*/
public void print() {
	System.out.println("Book Details");
	System.out.println("Book Name:"+bookName);
	System.out.println("Book Price:"+bookPrice);
	System.out.println("Book Author:"+authorName);
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book Details....\n Book Name: "+getBookName()+"\nBook Price:"+getBookPrice()+"\nAuthor Name:"+getAuthorName();
	}
}
