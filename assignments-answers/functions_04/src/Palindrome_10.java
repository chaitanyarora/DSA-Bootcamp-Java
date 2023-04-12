public class Palindrome_10 {
    static String Palindrome(int a){
        int sum=0, n;

        n=a;

        while(a>0){
            int temp = a%10;
            sum += temp*temp*temp;
            a=a/10;
        }
        if(sum == n){
            return "Palindrome";
        }else {
            return "Not Palindrome";
        }
    }

    public static void main(String[] args) {
        System.out.println("The number is " + Palindrome(153));
    }
}
