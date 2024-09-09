package org.com;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
  int n1 = sc.nextInt();
  float n2=sc.nextFloat();
   int sum = (int) (n1 +n2);//n2 is float so it conversion into int
   float add  = n1+n2;
   int sub = (int)(n2-n1);
   float minus = n2-n1;
   int mul = (int)(n1*n2);
   float product = n1*n2;
   int div = (int)(n2/n1);
   float division = n2/n1;
   System.out.println(" print sum of intger and float nu :" +sum);
   System.out.println(" print sum of intger and float nu :" +add);
   System.out.println(" print substract of integer and float nu :" +sub);
   System.out.println(" print substract of intger and float nu :" +minus);
   System.out.println(" print multiplication of intger and float nu :" +mul);
   System.out.println(" print multiplication of intger and float nu :" +product);
   System.out.println(" print division of intger and float nu :" +div);
   System.out.println(" print division of intger and float nu :" +division);
   
	}

}
