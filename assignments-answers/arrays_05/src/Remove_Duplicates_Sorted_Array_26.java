import java.util.Arrays;

public class Remove_Duplicates_Sorted_Array_26 {
    public static int removeDuplicates(int[] nums) {
        int[] a = new int[nums.length];
        int max = Integer.MIN_VALUE, count=1, j=0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i+1]){
                nums[count] = nums[i+1];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {1,1,2}, b = new int[a.length];

        System.out.println(removeDuplicates(a));
    }
}
