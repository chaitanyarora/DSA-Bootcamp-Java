import java.util.Scanner;

public class Largest_In_Two_5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int b, c;

        b = a.nextInt();
        c = a.nextInt();


        int largest;
        largest = (c<b)?b:c;

        System.out.println("The larger number is: " + largest);
    }
}
