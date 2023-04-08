import java.util.Scanner;
public class Calculator_If_Else_4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int c, b;
        char operator;

        c = a.nextInt();
        b = a.nextInt();

        operator = a.next().trim().charAt(0);

        if(operator == '+')
            System.out.println(c+b);
        else if (operator == '-') {
            System.out.println(c-b);
        } else if (operator == '*') {
            System.out.println(c*b);
        } else if (operator == '/') {
            System.out.println(c/b);
        } else if (operator == '%') {
            System.out.println(c%b);
        }

    }
}

//IMP: .trim() function and that characters should always be enclosed within '' single quotes.
