package org.com;
import java.util.Scanner;
public class TollBoothRevenueManager {
	
	 double cRate;
     double tRate;
     double mRate;
     int nCars;
      int nTrucks;
     int nMotorcycles;
     double totalRevenue;
     int totalVehicles;
     
    public void setTollRates() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the toll rate for Car : ");
        cRate = sc.nextDouble();

        System.out.print("Enter the toll rate for Truck: ");
        tRate = sc.nextDouble();

        System.out.print("Enter the toll rate for Motorcycle: ");
        mRate = sc.nextDouble();
    }

       public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Cars: ");
        nCars = scanner.nextInt();

        System.out.print("Enter the number of Trucks: ");
        nTrucks = scanner.nextInt();

        System.out.print("Enter the number of Motorcycles: ");
        nMotorcycles = scanner.nextInt();
    }

    public void calculateRevenue() {
        totalRevenue = (nCars * cRate) + (nTrucks * tRate) + (nMotorcycles * mRate);
        totalVehicles = nCars + nTrucks + nMotorcycles;
    }

   
    public void printRecord() {
        System.out.printf("Total Number of Vehicles: %d%n", totalVehicles);
        System.out.printf("Total Revenue Collected: ₹%.2f%n", totalRevenue);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBoothRevenueManager M = new TollBoothRevenueManager();

        M.setTollRates();
        M.acceptRecord();
        M.calculateRevenue();
        M.printRecord();
	//sc.close();
	}
}
