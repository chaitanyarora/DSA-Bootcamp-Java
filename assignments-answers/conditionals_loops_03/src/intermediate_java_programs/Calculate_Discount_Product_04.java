package intermediate_java_programs;

import java.util.Scanner;

public class Calculate_Discount_Product_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float price = in.nextFloat();
        float final_price;

        System.out.println("Enter discount percentage");

        int discount = in.nextInt();

        float new_price = (price*discount)/100;

        final_price = price - new_price;

        System.out.println("The final price is " + final_price);
    }
}
