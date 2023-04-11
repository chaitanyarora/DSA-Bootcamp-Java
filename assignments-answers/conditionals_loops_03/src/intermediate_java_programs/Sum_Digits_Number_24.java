package intermediate_java_programs;

import java.util.Scanner;

public class Sum_Digits_Number_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), sum=0;

        while(a>0){
            int temp = a%10;
            sum += temp;
            a=a/10;
        }
        System.out.println("The sum of digits is " + sum);
    }
}
