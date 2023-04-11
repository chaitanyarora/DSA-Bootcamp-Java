package intermediate_java_programs;

import java.util.Scanner;

public class HCF_Two_Numbers_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int min = (a<b)?a:b, hcf=1;

        for (int i = 1; i < min; i++) {

            if(a%i == 0 && b%i==0){
                hcf = i;
            }

        }
        System.out.println("The hcf of " + a + " and " + b + " is " + hcf);
    }
}
