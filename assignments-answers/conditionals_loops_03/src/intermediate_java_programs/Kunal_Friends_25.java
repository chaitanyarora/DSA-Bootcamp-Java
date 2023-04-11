package intermediate_java_programs;

import java.util.Scanner;

public class Kunal_Friends_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 31; i++) {

            if(i%2 == 0){
                System.out.println("Kunal can go out because its " + i + " August");
            } else {
                System.out.println("Kunal cannot go out because its " + i + " August");
            }

        }
    }
}
