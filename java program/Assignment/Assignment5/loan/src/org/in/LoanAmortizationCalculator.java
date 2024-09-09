package org.in;

import java.util.Scanner;

public class LoanAmortizationCalculator {
	private double principle;
	private double rate;
	private double year;
	
public void acceptRecord() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principle");
	principle = sc.nextDouble();
	System.out.println("Enter the rate :");
	rate = sc.nextDouble();
	System.out.println(" Enter the year : ");
	year = sc.nextDouble();
	
}
public double  calcuteMonthlyPayment() {
	 double mRate = rate / 12 / 100;
	 double months = year*12;
	  return principle * (mRate*Math.pow(1+mRate, months))/(Math.pow(1+mRate, months)-1);
	
}
public void printRecord() {
	double mPay = calcuteMonthlyPayment();
	double tam = mPay*year*12;
	System.out.println("Monthly payment :" +mPay);
	System.out.println("total amount :" +tam);
	
}
	public static void main(String[] args) {
		LoanAmortizationCalculator cal = new LoanAmortizationCalculator();// TODO Auto-generated method stub
		cal.acceptRecord();
		cal.calcuteMonthlyPayment();
		cal.printRecord();
	}

}
