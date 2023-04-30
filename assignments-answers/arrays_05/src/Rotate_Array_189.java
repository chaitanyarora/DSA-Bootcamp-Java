import java.util.Arrays;

public class Rotate_Array_189 {
//    public static void rotate(int[] nums, int k) {
//        for (int j = 0; j < k; j++) {
//            int temp = nums[nums.length-1];
//            for (int i = nums.length-1; i > 0; i--) {
//                nums[i] = nums[i-1];
//            }
//            nums[0] = temp;
//        }
//    }

    static int[] reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        return b;
    }

    public static void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        int m=0;

        a=nums.clone();

        reverse(nums, k);

        reverse(nums, nums.length);

//        for (int i = 0; i < nums.length - k; i++) {
//            nums[m] = a[i];
//            m++;
//        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};

        rotate(a, 3);

        System.out.println(Arrays.toString(a));
    }
}
