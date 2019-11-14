package org.interfa;

public class ExampleInterface {
	public static void main(String[] args) {
		Book obj;
		obj = new Sapna();
		obj.bookName("Tom and jerry");
		obj.bookPrice(200);
		obj.bookAuthor("CN");
		obj.display();
	}
}
