import java.util.Scanner;
import java.util.Random;


public class Dice {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many sides does dice 1 have? ");
        int d1sides = scanner.nextInt();

        System.out.println("How many sides does dice 2 have? ");
        int d2sides = scanner.nextInt();

        int d1rolls = 0; //total rolls for dice 1
        int d2rolls = 0;//total rolls for dice 2

        int numRolls = 3; //rolls 3 times

        for (int i = 1; i <= numRolls; i++){
            int roll1 = random.nextInt(d1sides)+ 1;
            int roll2 = random.nextInt(d2sides)+ 1;

            d1rolls += roll1;
            d2rolls += roll2;

            System.out.println("Die 1 roll "+ i + " = "+ roll1);
            System.out.println("Die 2 roll "+ i + " = "+ roll2);
        }

        double average1 = (double) d1rolls / numRolls;
        double average2 = (double) d2rolls / numRolls;

        System.out.println("Die 1 rolled a total of " + d1rolls + " and rolled " + average1 + " on average.");
        System.out.println("Die 2 rolled a total of " + d2rolls + " and rolled " + average2 + " on average.");


    }
}
