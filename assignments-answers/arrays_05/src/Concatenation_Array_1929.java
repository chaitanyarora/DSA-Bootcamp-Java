import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_Array_1929 {
    public int[] getConcatenation(int[] nums) {

        int sum=0;

        int[] ans = new int[2*nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
        }

        int i=0;

        for(int j=nums.length;j<2*nums.length;j++){

            ans[j] = nums[i];
            i++;
        }
        return ans;


    }
}
