package decimal_fraction;

import java.util.Scanner;
public class Fraction {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the numerator of the fraction: ");
		int numerator = scanner.nextInt();
		
		System.out.print("Enter the denominator of the fraction: ");
		int denominator = scanner.nextInt();
		
		double decimal = (double) numerator/denominator;
		
		System.out.println("The decimal value of that fraction is "+decimal);
		

	}

}
