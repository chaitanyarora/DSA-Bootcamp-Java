package intermediate_java_programs;

import java.util.Scanner;

public class Vowel_Or_Consonant_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
