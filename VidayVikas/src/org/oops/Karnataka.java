package org.oops;

public class Karnataka extends RBI {
public static int balance;
public Karnataka() {
	// TODO Auto-generated constructor stub
	System.out.println("Welcome to Karnataka");
}
	@Override
	public int deposite(int amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
		printBalance();
		return balance;
	}

	@Override
	public int withdraw(int amount) {
		// TODO Auto-generated method stub
		if(balance>=amount)
		{
			balance=balance-amount;
		
		}
		printBalance();
		return balance;
	
	}

	@Override
	public void printBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance:"+balance);
	}

	

}
