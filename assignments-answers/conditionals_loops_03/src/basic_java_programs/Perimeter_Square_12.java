import java.util.Scanner;

public class Perimeter_Square_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float side = in.nextFloat();

        double perimeter = 4*side;

        System.out.println("The perimeter os square is " + perimeter);
    }
}
