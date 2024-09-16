package org.com;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				int[] array = new int[5];

				acceptRecord(array);

				printRecord(array);
			}

			public static void acceptRecord(int[] array) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 5 integers:");
				for (int i = 0; i < array.length; i++) {
					array[i] = sc.nextInt();
				}
			}

			public static void printRecord(int[] array) {
				System.out.println("The array elements are:");
				for (int value : array) {
					System.out.print(value + " ");
				}
				System.out.println(); // To print a newline at the end
			}
		}

//	}

//}
