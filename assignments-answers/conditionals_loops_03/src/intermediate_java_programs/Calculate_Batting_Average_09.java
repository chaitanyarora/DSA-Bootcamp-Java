package intermediate_java_programs;

import java.util.Scanner;

public class Calculate_Batting_Average_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int no_of_runs = in.nextInt(), no_of_out = in.nextInt();

        float average = no_of_runs/no_of_out;

        System.out.println("The batting average of the player is " + average);
    }
}
