package org.com;
import java.util.*;
public class Transval {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];//5 nu array declaration
		System.out.println("Default values of array:");
		for (int row =0;row<arr.length; ++row) {
			System.out.println("array index " + row + ":"+ arr[row]);
	
		}
		//accept to user 5 nu
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer :");
        for ( int row=0;row<arr.length;++row) {
        	System.out.println("Enter the  value index:" +row+ ":");
             arr[row] =sc.nextInt();
        }
        //print this 5 nu array
        System.out.println("new values of array :" );
        for (int row =0;row<arr.length;row++) {
        	System.out.println("value at index" +row+ ":"+arr[row]);
        }
	
	sc.close();
	}
}

