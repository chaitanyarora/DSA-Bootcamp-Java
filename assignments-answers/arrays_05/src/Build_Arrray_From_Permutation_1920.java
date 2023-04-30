import java.util.Arrays;
import java.util.Scanner;

public class Build_Arrray_From_Permutation_1920 {

    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] a = {0,2,1,5,3,4};

        a = buildArray(a);

        System.out.println(Arrays.toString(a));

    }
}
