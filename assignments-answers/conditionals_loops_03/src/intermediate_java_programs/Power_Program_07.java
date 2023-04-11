package intermediate_java_programs;

import java.util.Scanner;

public class Power_Program_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int b = in.nextInt();

        System.out.println("Enter power");
        int a = in.nextInt(), c=1;

        for(int i=1;i<=a;i++){
            c = c * b;
        }
        System.out.println("The answer is " + c);
    }
}
