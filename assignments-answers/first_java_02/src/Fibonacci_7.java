import java.util.Scanner;

public class Fibonacci_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum=0, a=0, b=1, n=4, next;

//        n = in.nextInt();


        for(int i=2; i<n; i++){
            sum = a + b;

            a = b;
            b = sum;
        }
        System.out.println(sum);


    }
}
