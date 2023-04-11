package intermediate_java_programs;

import java.util.Scanner;

public class Calculate_Distance_Between_Two_Points_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float point1 = in.nextFloat(), dist;
        float point2 = in.nextFloat();

        dist = point1-point2;

        System.out.println("The distance is " + Math.sqrt(Math.pow(dist, 2)));
    }
}
