import java.util.Scanner;

public class Perimeter_Rectangle_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float side1 = in.nextFloat();
        float side2 = in.nextFloat();


        double perimeter = 2*side1 + 2*side2;

        System.out.println("The perimeter is " + perimeter);
    }
}
