package intermediate_java_programs;

import java.util.Scanner;

public class Reverse_String_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine(), c="";

        System.out.println(a);

        int length = a.length();

        System.out.println(length);
        char b ;

        for (int i = length-1; i >= 0; i--) {
            b = a.charAt(i);
            c += b;
        }
        System.out.println("The reverse is " + c);
    }
}
