package intermediate_java_programs;

import java.util.Scanner;

public class Calculate_Depreciation_Value_08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double v1 = in.nextFloat(), rate = in.nextInt(), time = in.nextInt(), v2;

        v2 = v1*Math.pow((1-rate/100), time);

        System.out.println("The depreciation value is " + v2);

    }
}

// v2 = v1 (1 - r/100)^t