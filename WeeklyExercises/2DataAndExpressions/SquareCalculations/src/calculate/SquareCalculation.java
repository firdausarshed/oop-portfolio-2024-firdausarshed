package calculate;

	import java.util.Scanner;

	public class SquareCalculation {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the side length: ");
	        int sideLength = scanner.nextInt();

	        int perimeter = 4 * sideLength;

	        int area = sideLength * sideLength;

	        System.out.println("The square's perimeter is " + perimeter);
	        System.out.println("The square's area " + area);

	        scanner.close();
	   }
}
