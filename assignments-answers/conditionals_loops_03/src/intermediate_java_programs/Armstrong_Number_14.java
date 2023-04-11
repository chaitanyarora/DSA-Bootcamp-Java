package intermediate_java_programs;

import java.util.Scanner;

public class Armstrong_Number_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), sum=0, b;

        b = n;

        while(n>0){
            int a = n%10;
            sum += Math.pow(a, 3);
            n = n/10;
        }
        if(b == sum){
            System.out.println("Armstrong");
        }else {
            System.out.println("Not");

        }
    }
}
