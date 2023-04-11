package intermediate_java_programs;

import java.util.Scanner;

public class LCM_Two_Numbers_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int min = (a<b)?a:b, hcf=1, lcm;

        for (int i = 1; i < min; i++) {

            if(a%i == 0 && b%i==0){
                hcf = i;
            }

        }

        lcm = a*b/hcf;

        System.out.println("The lcm of " + a + " and " + b + " is " + lcm);
    }
}
