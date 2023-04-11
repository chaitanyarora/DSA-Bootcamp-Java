import java.util.Scanner;

public class Perimeter_Circle_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float radius = in.nextFloat();


        double perimeter = 2*3.14*radius;

        System.out.println("The perimeter is " + perimeter);
    }
}
