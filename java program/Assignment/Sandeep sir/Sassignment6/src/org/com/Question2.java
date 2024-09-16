package org.com;
import java.util.Scanner;
class Question_2 {
int[] arr = new int[5];
public void acceptRecord(){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter elements of an array");
    for(int i=0 ; i<arr.length ; i++) {
        arr[i] = sc.nextInt();
    }
}
public void printRecord(){
   System.out.println("The elements of an array");
	for (int i=0 ; i<arr.length ; i++) {
       System.out.println(arr[i]);
}
}
}
public class Question2{
  public static void main(String[] args) {
	Question_2 q= new Question_2();
	q.acceptRecord();
	q.printRecord();
}
}

 
	


