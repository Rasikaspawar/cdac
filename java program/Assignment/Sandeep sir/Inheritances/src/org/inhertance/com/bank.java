package org.inhertance.com;

import java.util.Scanner;

public class bank {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc bc = new BankAcc("0987654321",15000.0);
		Savingacc ac = new Savingacc("1234567890",15000.0,15000.0,1200.0);
		//Savingacc ac =new Savingacc();
		System.out.println("Bank operation :");
		//bc.withdraw(100.0);
		ac.deposit(500.0);
		ac.withdraw(300.0);
				System.out.println("bank Account nu :" +bc.getAcc_nu());
		System.out.println("current  balance :" +bc.getBalance());
		System.out.println("after deposite operation amount: "  +ac.getBalance());
		System.out.println( "After withdraw amount:" +ac.getCurrent_Balance());
		System.out.println("After saving acco withdreaw amount:" +bc.getBalance());
		
		

	}

}
