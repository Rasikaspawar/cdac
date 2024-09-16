package org.com;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 4, 5}; // Missing number is 3
		int N = 5; // The array should contain numbers from 1 to N

		int missingNumber = findMissingNumber(array, N);

		System.out.println("The missing number is: " + missingNumber);
	}

	public static int findMissingNumber(int[] arr, int N) {
		int expectedSum = N * (N + 1) / 2;

		int actualSum = 0;
		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}

		return expectedSum - actualSum;
	}
}

	


