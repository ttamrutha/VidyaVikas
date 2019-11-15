package org.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Amazon {
public static List<Products> getAllProducts()
{
	List<Products> pList=new ArrayList<>();
	Products p[]=new Products[5];
	for(int i=0;i<p.length;i++)
	{
		p[i]=new Products();
		p[i].setProductName(generateName());
		p[i].setProductId(i+1);
		p[i].setProductPrice(generateprice());
		p[i].setProductDescription(generateDescription());
		pList.add(p[i]);
	}
	return pList;
}
public static String generateName()
{
	Random r=new Random();
	String name="";
	for(int i=0;i<4;i++)
	{
		char ch=(char) (65+(r.nextInt(26)));
		name+=ch;
	}
	return name;
}
public static String generateDescription()
{
	Random r=new Random();
	String des="";
	for(int i=0;i<10;i++)
	{
		char ch=(char) (97+(r.nextInt(26)));
		des+=ch;
	}
	return des;
}
public static int generateprice()
{
	int price=0;
	Random r=new Random();
	price=r.nextInt(10)+1000;
	return price;
}
public static void main(String[] args) {
	System.out.println("Welcome to Amazon...");
	List<Products> plist=getAllProducts();
	Scanner key=new Scanner(System.in);
	List<Products> cart=new ArrayList<>();
	while(true)
	{
	System.out.println("1. View Produts 2.View Cart");
	int ch=key.nextInt();
	int op=0;
	if(ch==1)
	{
		for(int i=0;i<plist.size();i++)
		{
			Products p=plist.get(i);
			System.out.println(p.getProductId()+") "+p.getProductName()+"\t"+p.getProductPrice()+"\t"+p.getProductDescription());
		}
		System.out.println("Enter product Id add to cart...");
		op=key.nextInt();
		cart.add(plist.get(op-1));
	}
	else if(ch==2)
	{
		for(int i=0;i<cart.size();i++)
		{
			Products p=cart.get(i);
			System.out.println(p.getProductId()+") "+p.getProductName()+"\t"+p.getProductPrice()+"\t"+p.getProductDescription());
		}
		System.out.println("1. Checkout 2. Remove ");
		int chk=key.nextInt();
		if(chk==1)
		{
			int total=0;
			for(int i=0;i<cart.size();i++)
			{
				Products p=cart.get(i);
				total+=p.getProductPrice();
			}
			System.out.println("Toatl Amount to Pay "+total);
			System.out.println("Thank you for shoping... ");
			cart.clear();
		}
		else if(chk==2)
		{
			for(int i=0;i<cart.size();i++)
			{
				Products p=cart.get(i);
				System.out.println(p.getProductId()+") "+p.getProductName()+"\t"+p.getProductPrice()+"\t"+p.getProductDescription());
			}
			System.out.println("Enter product Id  to remove from cart...");
				int pId=key.nextInt();
				cart.remove(pId-1);
		}
	}
	}
}
}
