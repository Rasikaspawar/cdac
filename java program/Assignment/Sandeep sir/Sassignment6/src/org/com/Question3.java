package org.com;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		 int n = sc.nextInt();
		System.out.println();
		int [] arr = new int [n] ;//{100,7,0,34};//this is hard coded 5 array values
		int max = arr[0];
		int min = arr[0];
		for (int row = 1; row <arr.length; ++row) {
			    if(max<arr[row]){
				  max=arr[row]; 
				}
			  if(min>arr[row]){
				   min = arr[row];
			}}
			 System.out.println( " max nu "+max);  
			System.out.println("Min nu of array :" +min);

	}

}
