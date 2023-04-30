import java.util.ArrayList;
import java.util.Collections;

public class Maximum_Subarray_53 {
    public static int maxSubArray(int[] nums) {
        int sum=0, new_sum=0;
        ArrayList<Integer> a = new ArrayList<Integer>(1);

        for (int i = 0; i < nums.length; i++) {
            int sum1=0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[i];
                if(sum < sum1)
                    a.add(sum1);
            }
            if(sum < sum1)
                sum = sum1;
        }

        return Collections.max(a);
    }
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(a));
    }
}
