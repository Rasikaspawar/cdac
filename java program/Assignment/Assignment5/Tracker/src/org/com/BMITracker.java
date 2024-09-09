package org.com;
import java.util.Scanner;
public class BMITracker {
	int w;
	int h;
	int BMI;
	
	public void acceptRecord(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Height:" );
		h = sc.nextInt();
		System.out.print("Enter the weight :");
		w = sc.nextInt();
	}
	public void calculateBMI() {
		BMI = w/h*h;
	}
	public void classifyBMIprintRecord (){
		if(BMI<18.5) {
			System.out.println("under weight");
		}
		else if( 18.5<=BMI && BMI>=24.9) {
			System.out.println("Normal weight");
		}
		else if(25<=BMI && BMI>29.9) {
			System.out.println(" Overweight");
		}
		else {
			System.out.println("obesm ");
		}
		
	}
	
	public static void main(String[] args) {
   
		// TODO Auto-generated method stub
		BMITracker BI = new BMITracker();
		BI.acceptRecord();
		BI.calculateBMI();
		BI.classifyBMIprintRecord();
	}

}
