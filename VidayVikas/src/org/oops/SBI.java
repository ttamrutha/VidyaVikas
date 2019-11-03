package org.oops;

public class SBI extends RBI {
public static int balance;
public SBI() {
	// TODO Auto-generated constructor stub
	System.out.println("Welcome to SBI...");
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
