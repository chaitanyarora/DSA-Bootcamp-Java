package intermediate_java_programs;

import java.util.Scanner;

public class Perfect_Number_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), sum=0;

        for (int i = 1; i < a; i++) {
            if(a%i==0){
                sum += i;
                System.out.println("This is a factor " + i);
            }
        }
        if(sum == a){
            System.out.println("This is a perfect number");
        }else {
            System.out.println("This is NOT a perfect number");

        }
    }
}

// If the sum of factors of the number is equal to the number then it is called a perfect number