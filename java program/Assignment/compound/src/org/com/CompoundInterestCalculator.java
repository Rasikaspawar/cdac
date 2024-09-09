package org.com;
import java.util.*;
public class CompoundInterestCalculator {
	double P;
	double R;
	double y;
	double N;
	int n;
    double Fv;
    double TIE;
    
    public void acceptRecord() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the principle:");
    	P = sc.nextDouble();
    	System.out.println("Enter the Rate:");
    	R = sc.nextDouble();
    	System.out.println("Enter the year:");
    	y = sc.nextDouble();
    	System.out.println("Enter the time:");
    	N = sc.nextDouble();
    	
    }
    
    public void calculateFutureValue() {
    	Fv = P*Math.pow(1+R/N,N*y);
    	TIE = Fv - P;
    	
    }
    public void printRecord() {
    	System.out.println("Future value ₹%.2f%n : " +Fv);
    	System.out.println("Total interset ₹%.2f%n :" +TIE);
    } 
     	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompoundInterestCalculator CI = new CompoundInterestCalculator();
		CI.acceptRecord();
		CI.calculateFutureValue();
		CI.printRecord();

	}

}
