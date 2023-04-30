import java.util.Arrays;
public class Sort_Colors_75 {

    public static void sortColors(int[] nums) {

        for (int j = 0; j < nums.length-1; j++) {
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i+1] < nums[i]){
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};

        sortColors(a);

        System.out.println(Arrays.toString(a));
    }
}
