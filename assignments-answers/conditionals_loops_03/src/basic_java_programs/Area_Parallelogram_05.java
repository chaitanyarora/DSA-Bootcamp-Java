import java.util.Scanner;

public class Area_Parallelogram_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float height = in.nextFloat();
        float base = in.nextFloat();

        double area = (height*base);

        System.out.println("The area of parallelogram is " + area + "sq. units");
    }
}
