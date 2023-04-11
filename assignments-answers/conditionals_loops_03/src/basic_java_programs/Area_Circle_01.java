import java.util.Scanner;

public class Area_Circle_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float radius = in.nextFloat();

        double area = (3.14)*Math.pow(radius, 2);

        System.out.println("The area is " + area);


    }
}
