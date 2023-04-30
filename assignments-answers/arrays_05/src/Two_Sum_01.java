import java.util.Arrays;

public class Two_Sum_01 {
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i]+nums[j]==target && i!=j){
                    a[0]=i;
                    a[1]=j;
                }
            }
        }

        return a;
    }
    public static void main(String[] args) {
        int[] a = {3,3};

        System.out.println(Arrays.toString(twoSum(a, 6)));
    }
}
