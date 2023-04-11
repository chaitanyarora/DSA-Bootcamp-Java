package intermediate_java_programs;

import java.util.Scanner;

public class Electricity_Bill_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int units = in.nextInt(), amount;

        if(units <= 100){
            amount = units*10;
            System.out.println("The bill is " + amount);
        } else if (units <= 200) {
            units = units-100;
            amount = units*15 + 1000;
            System.out.println("The bill is " + amount);
        } else if (units <= 300) {
            units = units-200;
            amount = units*20 + 1000 + 1500;
            System.out.println("The bill is " + amount);
        } else {
            units = units-300;
            amount = units*25 + 1000 + 1500 + 2000;
            System.out.println("The bill is " + amount);
        }

    }
}

//1 to 100 units – Rs. 10/unit
//100 to 200 units – Rs. 15/unit
//200 to 300 units – Rs. 20/unit
//above 300 units – Rs. 25/unit