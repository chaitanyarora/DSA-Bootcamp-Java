import java.util.Scanner;

//A = P(1+rt)
public class Simple_Interest_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        float amount, rate;
        int time, principle;

        rate = a.nextFloat();
        time = a.nextInt();
        principle = a.nextInt();

        amount = principle*(1 + rate*time);

        System.out.println("The amount is :" + amount);

    }
}
