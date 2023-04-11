package intermediate_java_programs;

import java.util.Scanner;

public class Calculate_Average_Of_N_Numbers_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float n = in.nextFloat(), average, sum=0;

        for(int i=0; i<=n; i++){
            sum = sum + i;
        }

        average = sum/n;

        System.out.println("The average is " + average);
    }
}
