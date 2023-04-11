package intermediate_java_programs;

import java.util.Scanner;

public class Calculate_Average_Marks_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextFloat(), b = in.nextFloat(), c;

        c = a/b;

        System.out.println("the average marks is" + c);
    }
}
