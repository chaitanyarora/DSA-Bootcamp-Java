package intermediate_java_programs;

import java.util.Scanner;

public class Ncr_And_Npr_15 {

    public double Factorial(double n){

        double factorial=1;

        while(n>0){
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = in.nextInt();

        System.out.println("Enter c: ");
        float c = in.nextFloat();

        System.out.println("Enter r: ");
        int r = in.nextInt();

        double ncr;

        while(n>0){
//            ncr = Factorial(n)/Factorial(n-r)*Factorial(r);

            n--; r--;
        }

    }
}
