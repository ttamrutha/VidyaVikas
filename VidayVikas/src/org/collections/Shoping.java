package org.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

public class Shoping {
public static void main(String[] args) {
	 List<Products> productList=new ArrayList<>();
	 List<Products> cart=new ArrayList<>();
	 Products obj=new Products();
	 obj.setProductDescription("blahhhh");
	 obj.setProductName("tv");
	 obj.setProductId(01);
	 obj.setProductPrice(2000);
	 productList.add(obj);
	 Products obj1=new Products();
	  obj1.setProductDescription("blahhhh");
	 obj1.setProductName("Mobile");
	 obj1.setProductId(01);
	 obj1.setProductPrice(2000);
	 productList.add(obj1);
	 for(int i=0;i<productList.size();i++)
	 {
		 System.out.print(i+1+" "+productList.get(i).getProductName()+",");
	 }
	 int ch=1;
	 cart.add(productList.get(ch-1));
	 System.out.println("Cart Details.....");
	 for(int i=0;i<cart.size();i++)
	 {
		 System.out.println(i+1+" "+cart.get(i).getProductName());
	 }
}
}
