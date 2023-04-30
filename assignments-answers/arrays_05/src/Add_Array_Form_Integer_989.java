import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class Add_Array_Form_Integer_989 {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> a = new ArrayList<Integer>(1);
        int b = 0;

        for (int i = 0; i < num.length; i++) {
            b += num[i];
            b = b*10;
        }
        b = b/10;
        b = b+k;

        int j=0, c= b;

        while (b > 0){
            j++;
            b = b/10;
        }

        for (int i = 0; i < j; i++) {
            int temp = c%10;
            a.add(temp);
            c = c/10;
        }

        Collections.reverse(a);

        return a;
    }

    public static void main(String[] args) {

    }
}
