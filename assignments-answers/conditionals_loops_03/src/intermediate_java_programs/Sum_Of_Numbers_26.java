package intermediate_java_programs;

import java.util.Scanner;

public class Sum_Of_Numbers_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), sumn=0, sume=0, sumo=0;

        while(a != 0){
            if(a < 0){
                sumn += a;
            } else if (a%2 == 0) {
                sume += a;
            } else {
                sumo += a;
            }
            a = in.nextInt();
        }
        System.out.println("The sum of negative entries is " + sumn);
        System.out.println("The sum of positive even entries is " + sume);
        System.out.println("The sum of positive odd entries is " + sumo);
    }
}
