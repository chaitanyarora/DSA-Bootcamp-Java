import java.util.Scanner;

public class Odd_Even_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = num.nextInt();

        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        System.out.println("Your number is:" + a);
    }
}
