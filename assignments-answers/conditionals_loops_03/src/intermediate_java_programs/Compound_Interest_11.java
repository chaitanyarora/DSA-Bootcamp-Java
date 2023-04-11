package intermediate_java_programs;

import java.util.Scanner;

public class Compound_Interest_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double amount, principle = in.nextFloat(), rate = in.nextFloat(), time = in.nextInt();

        amount = principle*Math.pow((1+ rate), time);

        System.out.println("The compound interest is " + amount);
    }
}
