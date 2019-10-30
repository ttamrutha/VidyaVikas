package org.oops;

public class PassingArrayOfObjects {
	public static void main(String[] args) {
		Book obj[] = new Book[2];
		obj[0] = new Book();
		obj[0].setAuthorName("0author");
		obj[0].setBookPrice(222);
		obj[0].setBookName("0title");
		obj[1] = new Book();
		obj[1].setAuthorName("1author");
		obj[1].setBookPrice(111);
		obj[1].setBookName("1title");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].getAuthorName());
			System.out.println(obj[i].getBookPrice());
			System.out.println(obj[i].getBookName());
		}
	}
}
