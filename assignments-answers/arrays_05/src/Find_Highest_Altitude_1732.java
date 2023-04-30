import java.util.ArrayList;
import java.util.Collections;

public class Find_Highest_Altitude_1732 {

    public static int largestAltitude(int[] gain) {
        int sum=0, max=Integer.MIN_VALUE;

        ArrayList<Integer> summation = new ArrayList<>(1);

        summation.add(0);

        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            summation.add(sum);
        }

        max = Collections.max(summation);

        return max;
    }
    public static void main(String[] args) {

        int[] a = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(a));
    }
}
