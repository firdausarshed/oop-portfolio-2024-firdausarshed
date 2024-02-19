package m2k;

import java.util.Scanner;
public class MilesToKilometers {

	public static void main(String[] args) {
		final double MILETOKILOMETER = 1.60935;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of miles: ");
		
		double miles = scanner.nextDouble();
		
		double kilometers = miles*MILETOKILOMETER;
		
		System.out.println(miles+" miles is equal to "+kilometers +" kilometers.");
	}

}
