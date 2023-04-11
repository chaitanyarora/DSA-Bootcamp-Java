import java.util.Scanner;

public class Print_sum_of_all_numbers_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=1, sum=0;

        while(n != 0){
            n = in.nextInt();
            sum += n;
            System.out.println("The sum is " + sum);
        }
    }
}
