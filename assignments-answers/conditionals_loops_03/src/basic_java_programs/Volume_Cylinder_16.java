import java.util.Scanner;

public class Volume_Cylinder_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float height = in.nextFloat();
        float radius = in.nextFloat();

        double area = (3.14*Math.pow(radius, 2))*height;

        System.out.println("The volume of the cylinder is " + area);
    }
}

// volume = pie*radius^2*height
