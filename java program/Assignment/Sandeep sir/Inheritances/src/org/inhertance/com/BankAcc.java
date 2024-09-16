package org.inhertance.com;

public class BankAcc {

	private String Acc_nu;
	private double Balance;
	
	public BankAcc(String Acc_nu,double Balance) {
		this.Acc_nu = Acc_nu;
		this.Balance = Balance;
	}
	public void deposit(Double Amount) {
	Balance = Balance + Amount;
	//System.out.println("Balance :" +Balance);
	}
	public void withdraw(double amount) {
	if (Balance>=amount) {
		Balance = Balance - amount;
	}
	else
	 { 
		System.out.println("You have insufficient balance");
	}
	
		
	}
	public String getAcc_nu() {
		return Acc_nu;
	}
	public void setAcc_nu(String acc_nu) {
		Acc_nu = acc_nu;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "BankAcc [Acc_nu=" + Acc_nu + ", "
				+ "Balance=" + Balance + "]";
	}
	
}
 

