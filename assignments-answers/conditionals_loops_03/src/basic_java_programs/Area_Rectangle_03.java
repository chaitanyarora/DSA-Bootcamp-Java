import java.util.Scanner;

public class Area_Rectangle_03 {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

                float length = in.nextFloat();
                float breadth = in.nextFloat();

                double area = length*breadth;

                System.out.println("The area is " + area);

    }
}