package org.arrays;

public class d {
	int n=0;
public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
public static d[] sortN(d[] nos)
{
	int min=nos[0].getN();
	for(int i=0;i<nos.length;i++)
	{
		d obj=nos[i];
		if(obj.getN()<min)
	}
}
public static void main(String[] args) {
	d obj[]=new d[3];
	obj[0]=new d();
	obj[0].setN(10);
	obj[1]=new d();
	obj[1].setN(100);
	obj[2]=new d();
	obj[2].setN(1);
	
	
}
}
