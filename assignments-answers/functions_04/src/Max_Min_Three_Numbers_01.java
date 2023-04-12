import java.util.Scanner;

public class Max_Min_Three_Numbers_01 {

    static int max(int a, int b, int c){

        int max = 0;

        if (a > max) {
            max=a;
        }
        if (b > max) {
            max=b;
        }
        if(c > max){
            max=c;
        }
        return max;
    }

    static int min(int a, int b, int c){

        int min = Integer.MAX_VALUE;

        if (a < min) {
            min=a;
        }
        if (b < min) {
            min=b;
        }
        if(c < min){
            min=c;
        }
        return min;
    }
    public static void main(String[] args) {
        int l = max(1, 5, 7);
        int s = min(1, 5, 7);

        System.out.println("The maximum is " + l);
        System.out.println("The minimum is " + s);
    }
}
