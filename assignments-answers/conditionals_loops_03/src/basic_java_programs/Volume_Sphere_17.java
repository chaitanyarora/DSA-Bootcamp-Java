import java.util.Scanner;

public class Volume_Sphere_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float radius = in.nextFloat();

        double area = (1.333)*(3.14*Math.pow(radius, 3));

        System.out.println("The volume of the sphere is " + area);
    }
}
