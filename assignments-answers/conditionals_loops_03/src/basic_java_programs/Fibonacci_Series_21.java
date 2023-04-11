import java.util.Scanner;

public class Fibonacci_Series_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(), first, second, third;

        first = 0;
        second = 1;

        third = first + second;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third + " ");

        while(n>0){

            first = second;
            second = third;

            third = first + second;

            System.out.println(third + " ");

            n--;
        }
    }
}
