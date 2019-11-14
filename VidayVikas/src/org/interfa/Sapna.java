package org.interfa;

public class Sapna implements Book {
	private int price;
	private String name, author;

	@Override
	public void bookPrice(int price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

	@Override
	public void bookName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void bookAuthor(String author) {
		// TODO Auto-generated method stub
		this.author = author;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Book Name " + name);
		System.out.println("Book Price " + price);
		System.out.println("Book Author " + author);
	}

}
