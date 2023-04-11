import java.util.Scanner;

public class Volume_Cone_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float height = in.nextFloat();
        float radius = in.nextFloat();

        double area = (3.14*Math.pow(radius, 2))*(height/3);

        System.out.println("The volume of the cone is " + area);

    }
}

// PIE*r^2*height/3