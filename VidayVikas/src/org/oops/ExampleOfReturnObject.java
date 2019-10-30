package org.oops;

import java.awt.print.Book;
import java.util.Scanner;

class Books
{
	private  double price;
	private int id;
	private String title,author;
	public Books() {
		// TODO Auto-generated constructor stub
		price=0;
		id=0;
		title="";
		author="";
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}	
}




public class ExampleOfReturnObject {
	public static Books[]  SortingBooks(Books parameterObj[])
	{
		for(int i=0;i<parameterObj.length;i++)
		{
			for(int j=i+1;j<parameterObj.length;j++)
			{
				if(parameterObj[i].getPrice()>parameterObj[j].getPrice())
				{
					Books tempObj=parameterObj[i];
					parameterObj[i]=parameterObj[j];
					parameterObj[j]=tempObj;
				}
			}
			
		}
		return parameterObj;
		
		 
	}
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		Books obj[]=new Books[4];
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new Books();
			System.out.println("Enter Book Id");
			int id=Integer.parseInt(key.nextLine());
			System.out.println("Enter Book Name");
			String title=key.nextLine();
			System.out.println("Enter Book Author");
			String author=key.nextLine();
			System.out.println("Enter Book Price");
			double price=Double.parseDouble(key.nextLine());
			obj[i].setId(id);
			obj[i].setAuthor(author);
			obj[i].setPrice(price);
			obj[i].setTitle(title);
		}
		
		Books sortedobj[]=SortingBooks(obj);
		for(int i=0;i<sortedobj.length;i++)
		{
			System.out.println("Book["+i+"]");
			System.out.print("Id="+sortedobj[i].getId()+"\tTitle="+sortedobj[i].getTitle()+"\tAuthor="+sortedobj[i].getAuthor()+"\tPrice="+sortedobj[i].getPrice());
		System.out.println("---------------------------------------");
		}
	}

}
