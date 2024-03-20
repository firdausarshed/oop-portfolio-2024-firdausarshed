import java.util.Scanner;
import java.util.Random;

public class encrypt
{
    public static void  main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your 4 digit pin to encrypt: ");
        int pin = scan.nextInt();
        String hexval = Integer.toHexString(pin);

        Random random = new Random();
        int num1 = random.nextInt(64535) + 1001;
        int num2 = random.nextInt(64535) + 1001;

        String hex1 = Integer.toHexString(num1);
        String hex2 = Integer.toHexString(num2);

        System.out.println("Your encrypted pin number is: " +hex1 +hexval+ hex2);
    }

}
