import java.util.Arrays;

public class Running_Sum_1D_1480 {

    public int[] runningSum(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){

            int sum=0;

            for(int j=0; j<=i; j++){

                sum += nums[j];

            }
            ans[i] = sum;

        }
        ans[0]=nums[0];
        return ans;
    }
    public static void main(String[] args) {

    }
}
