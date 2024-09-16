package org.inhertance.com;

public class Savingacc extends BankAcc {
	private  Double Current_Balance;
	private  Double withdraw_limit;
	 public  Savingacc(String Acc_nu, Double Balance,Double Current_Balance,Double withdraw_limit){
		super(Acc_nu,Balance);
		this.Current_Balance = Current_Balance;
		this.withdraw_limit = withdraw_limit;
	
	 System.out.println(Acc_nu);}
	 @Override
 public void withdraw(double amount) {
	 
	 if (Current_Balance>=amount) {
			Current_Balance = Current_Balance - amount;
			}
		else
		 { 
			System.out.println("You have insufficient balance");
		}	
   
 }
public Double getCurrent_Balance() {
	return Current_Balance;
}
public void setCurrent_Balance(Double current_Balance) {
	Current_Balance = current_Balance;
}
public Double getWithdraw_limit() {
	return withdraw_limit;
}
public void setWithdraw_limit(Double withdraw_limit) {
	this.withdraw_limit = withdraw_limit;
}
@Override
public String toString() {
	return "Savingacc [Current_Balance=" + Current_Balance + ", withdraw_limit=" + withdraw_limit + ", getAcc_nu()="
			+ getAcc_nu() + "]";
}



}
