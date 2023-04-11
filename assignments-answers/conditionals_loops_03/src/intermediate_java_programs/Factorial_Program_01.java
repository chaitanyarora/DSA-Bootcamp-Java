package intermediate_java_programs;

import java.util.Scanner;

public class Factorial_Program_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), a, factorial=1;
        a=n;

        while(n>0){
            factorial =factorial * n;
            n--;
        }

        System.out.println("The factorial of " + a + "! is " + factorial);
    }
}
