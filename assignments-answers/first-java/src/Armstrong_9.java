import java.util.Scanner;

public class Armstrong_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, sum=0, b;

        System.out.println("Enter a number : ");
        a= in.nextInt();

        b =a;

        while(a>0){
            int temp = a%10;
            sum += Math.pow(temp, 3);

            a = a/10;
//            temp = temp *10;
        }

        if (sum == b){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not");
        }

    }
}
