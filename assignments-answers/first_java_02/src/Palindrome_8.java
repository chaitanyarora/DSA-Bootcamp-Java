import java.util.Scanner;

public class Palindrome_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), temp = 0, b;

 b=a;

        while(a>0){
            temp += a%10;
            a = a/10;

            temp = temp *10;
        }
        temp = temp/10;

       if(temp == b){
           System.out.println("Pallindrome");
       }
       else{
           System.out.println("No");
       }


        System.out.println(temp);
    }
}
