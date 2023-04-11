import java.util.Scanner;

public class Input_number_print_all_factors_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i=1;i<n;i++){
            if(n%i == 0){
                System.out.println("The factor of " + n + " is "+ i);
            }
        }
    }
}
