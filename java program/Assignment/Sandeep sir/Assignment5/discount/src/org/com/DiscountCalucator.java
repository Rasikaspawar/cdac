package org.com;
import java.util.Scanner;
public class DiscountCalucator {		
	double price;
	double  discountRate;
	double final_rate;
	double DiscountAmount;
	public void acceptREcord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Price:");
		price = sc.nextDouble();
		System.out.println("Enter the Discount:");
		discountRate = sc.nextDouble();
	}
	public void calculateDiscount() {
		// float r= discountRate/100;
		 //System.out.println(r);
		DiscountAmount = price * (discountRate / 100);
		System.out.println(DiscountAmount);
		final_rate = price - DiscountAmount;
	}
	public void printRecord(){
		System.out.println("Discount amount :  "+ DiscountAmount);
		System.out.println("final_price : "+ final_rate);
	}
	public static void main(String[] args) {
		DiscountCalucator DC = new DiscountCalucator();
		DC.acceptREcord();
		DC.calculateDiscount();
		DC.printRecord();
   
	}

}


