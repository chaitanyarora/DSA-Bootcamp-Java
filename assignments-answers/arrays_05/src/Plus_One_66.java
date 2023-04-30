import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Plus_One_66 {
    public static int[] plusOne(int[] digits) {
        int num = 0;
        ArrayList<Integer> a = new ArrayList<>(1);


        for (int i = 0; i < digits.length; i++) {
            int n=digits[i];
            n = n*10;
            num += n;
        }

        num++;

        while(num>0){
            int temp = num%10;
            num=num/10;
            a.add(temp);
        }
        Collections.reverse(a);
        int[] b = new int[a.size()];

        for (int i:a) {
            b[i] = i;
        }


        return b;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = plusOne(a);

        System.out.println(Arrays.toString(b));
    }
}
