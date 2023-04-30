import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_First_Last_Position_Element_Sorted_Array_34 {

    public static int[] searchRange(int[] nums, int target) {
        int low=0, high=nums.length-1;
        int i=0, j=0;
        int[] a = {-1, -1};



        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                a[0] = mid;
                break;
            } else if (nums[mid] < target) {
                low=mid+1;
            } else if (nums[mid] > target) {
                high=mid-1;
            }
        }

        return a;

    }
    public static void main(String[] args) {
            int[] a = {5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(a, 8)));
    }
}
