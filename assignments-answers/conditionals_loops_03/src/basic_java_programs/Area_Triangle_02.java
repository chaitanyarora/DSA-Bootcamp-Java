import java.util.Scanner;

public class Area_Triangle_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float height = in.nextFloat();
        float base = in.nextFloat();

        double area = (height*base)/2;

        System.out.println("The area is " + area);

    }
}
