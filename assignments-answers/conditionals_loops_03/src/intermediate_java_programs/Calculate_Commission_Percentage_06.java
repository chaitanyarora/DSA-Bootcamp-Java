package intermediate_java_programs;

import java.util.Scanner;

public class Calculate_Commission_Percentage_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float comission = in.nextFloat();
        float final_price;

        System.out.println("Enter discount percentage");

        int discount = in.nextInt();

        float new_price = (comission*discount)/100;

        final_price = comission - new_price;

        System.out.println("The final price is " + final_price);
    }
}
