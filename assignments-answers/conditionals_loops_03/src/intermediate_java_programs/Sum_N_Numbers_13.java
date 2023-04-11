package intermediate_java_programs;

import java.util.Scanner;

public class Sum_N_Numbers_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), sum=0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
