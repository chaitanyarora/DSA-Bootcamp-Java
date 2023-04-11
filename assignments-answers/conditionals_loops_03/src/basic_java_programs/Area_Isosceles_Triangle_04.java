import java.util.Scanner;

public class Area_Isosceles_Triangle_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float height = in.nextFloat();
        float base = in.nextFloat();

        double area = (height*base)/2;

        System.out.println("The area is " + area);
    }
}

// The two sides are congruent of a triangle.