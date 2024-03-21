import java.util.Scanner;


public class Sphere1
{
    public static void main(String[] args)
    {
        int d;
        double vol;
        double sa;
        int r;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the diameter of the sphere: ");
        d = scan.nextInt();

        r = d/2;

        vol = 4*Math.PI*(r*r*r)/3;
        sa =4*Math.PI*(r*r);

        System.out.println("Volume = "+ vol + "\nSurface Area = " + sa);




    }

}
