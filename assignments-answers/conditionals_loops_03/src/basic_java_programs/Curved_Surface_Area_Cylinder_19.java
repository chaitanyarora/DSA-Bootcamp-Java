import java.util.Scanner;

public class Curved_Surface_Area_Cylinder_19 {
    public static void main(String[] args) {
        final double PI = 3.1415;
        Scanner in = new Scanner(System.in);

        float radius = in.nextFloat();
        float height = in.nextFloat();

        double area = 2*(PI)*radius*height;

        System.out.println("The curved surface area of cylinder is " + area);
    }
}

// csa cylinder = 2 pi r h