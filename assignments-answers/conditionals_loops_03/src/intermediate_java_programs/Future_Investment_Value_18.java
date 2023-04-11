package intermediate_java_programs;

import java.util.Scanner;

public class Future_Investment_Value_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double f_value, p_value = in.nextFloat(), i_rate = in.nextFloat(), n = in.nextInt();

        f_value = p_value*Math.pow((1+ i_rate), n);

        System.out.println("The future investment value is " + f_value);
    }
}
