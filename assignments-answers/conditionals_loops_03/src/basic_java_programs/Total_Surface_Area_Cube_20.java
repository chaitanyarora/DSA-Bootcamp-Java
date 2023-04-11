import java.util.Scanner;

public class Total_Surface_Area_Cube_20 {
    public static void main(String[] args) {
        final double PI = 3.1415;
        Scanner in = new Scanner(System.in);

        float side = in.nextFloat();

        double tsa = 6*Math.pow(side, 2);

        System.out.println("The total surface area of cube is " + tsa);
    }
}
