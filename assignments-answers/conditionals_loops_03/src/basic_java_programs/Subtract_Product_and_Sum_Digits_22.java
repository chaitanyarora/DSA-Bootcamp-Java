import java.util.Scanner;

public class Subtract_Product_and_Sum_Digits_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int product=1, sum=0, sub;

        while(n>0){
            int temp = n%10;
            product = product*temp;
            sum = sum + temp;
            n=n/10;
        }

        System.out.println(product);


    }
}
