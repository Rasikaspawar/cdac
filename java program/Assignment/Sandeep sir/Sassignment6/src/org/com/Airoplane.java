package org.com;

import java.util.Scanner;

class AirplaneSeating {
	private char[][] seats;

	public AirplaneSeating(int rows, int columns) {
		seats = new char[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				seats[i][j] = 'A'; // 'A' means available
			}
		}
	}

	public void bookSeat(int row, int column) {
		if (isSeatValid(row, column)) {
			if (seats[row][column] == 'A') {
				seats[row][column] = 'B'; // 'B' means booked
				System.out.println("Seat booked successfully.");
			} else {
				System.out.println("Seat is already booked.");
			}
		}
	}

	public void cancelBooking(int row, int column) {
		if (isSeatValid(row, column)) {
			if (seats[row][column] == 'B') {
				seats[row][column] = 'A'; // Mark it as available again
				System.out.println("Booking canceled successfully.");
			} else {
				System.out.println("Seat is not booked.");
			}
		}
	}

	public boolean checkAvailability(int row, int column) {
		if (isSeatValid(row, column)) {
			return seats[row][column] == 'A'; // Return true if available
		}
		return false;
	}

	public void displaySeatingChart() {
		System.out.println("Seating Chart (A = Available, B = Booked):");
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
	}

	private boolean isSeatValid(int row, int column) {
		if (row >= 0 && row < seats.length && column >= 0 && column < seats[0].length) {
			return true;
		} else {
			System.out.println("Invalid seat position.");
			return false;
		}
	}
}
public class Airoplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		AirplaneSeating airplaneSeating = new AirplaneSeating(5, 4);

		int choice;
		do {
			System.out.println("\n--- Airplane Seat Manager ---");
			System.out.println("1. Book a Seat");
			System.out.println("2. Cancel a Booking");
			System.out.println("3. Check Seat Availability");
			System.out.println("4. Display Seating Chart");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter row (0-indexed): ");
					int bookRow = scanner.nextInt();
					System.out.print("Enter column (0-indexed): ");
					int bookColumn = scanner.nextInt();
					airplaneSeating.bookSeat(bookRow, bookColumn);
					break;
				case 2:
					System.out.print("Enter row (0-indexed): ");
					int cancelRow = scanner.nextInt();
					System.out.print("Enter column (0-indexed): ");
					int cancelColumn = scanner.nextInt();
					airplaneSeating.cancelBooking(cancelRow, cancelColumn);
					break;
				case 3:
					System.out.print("Enter row (0-indexed): ");
					int checkRow = scanner.nextInt();
					System.out.print("Enter column (0-indexed): ");
					int checkColumn = scanner.nextInt();
					if (airplaneSeating.checkAvailability(checkRow, checkColumn)) {
						System.out.println("Seat is available.");
					} else {
						System.out.println("Seat is booked.");
					}
					break;
				case 4:
					airplaneSeating.displaySeatingChart();
					break;
				case 5:
					System.out.println("Exiting the system...");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 5);

	}

}
