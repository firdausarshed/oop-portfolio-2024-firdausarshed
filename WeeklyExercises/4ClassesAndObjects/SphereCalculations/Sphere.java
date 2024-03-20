import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Sphere {

    public static void main(String[] args) {

        double vol;
        double  sa;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sphere radius: ");
        int r = scan.nextInt();

        vol = 4*Math.PI*(r*r*r)/3;
        sa =4*Math.PI*(r*r);

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println("Volume = " + df.format(vol));
        System.out.println("Surface area = " + df.format(sa));
    }
}