import java.util.Scanner;

public class Rupee_To_Dollar_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        double inr = in.nextDouble();

        double usd = inr * 0.012;

        System.out.println("The money is $" + usd);
    }
}
