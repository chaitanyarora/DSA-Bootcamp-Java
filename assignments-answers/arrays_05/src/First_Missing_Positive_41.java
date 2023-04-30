import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class First_Missing_Positive_41 {

//    public static int firstMissingPositive(int[] nums) {
//        Arrays.sort(nums);
//
//        int min=nums[0], max=nums[nums.length-1], j=0;
//
//
//        for (int i = min; i < max; i++) {
//            j = Arrays.binarySearch(nums, i);
//            if(j==-(nums.length+1) && j != 0){
//                return j;
//            }
//        }
//        return nums[nums.length-1]+1;
//    }
    public static void main(String[] args) {
        int[] a = {3,4,-1,1,6,9};

        Arrays.sort(a);

        int p = Arrays.binarySearch(a, 10);

        System.out.println(p);

//        System.out.println(firstMissingPositive(a));
    }
}
