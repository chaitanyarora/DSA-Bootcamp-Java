import java.util.Scanner;

public class Print_largest_number_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=1, max=0;

        while(n != 0){
            n = in.nextInt();

            if(n>=max){
                max = n;
                System.out.println("The maximum till now is " + max);
            }

        }
        System.out.println("The maximum was " + max);

    }
}
