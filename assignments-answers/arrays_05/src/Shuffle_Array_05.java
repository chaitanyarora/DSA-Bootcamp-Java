import java.lang.reflect.Array;
import java.util.Arrays;
//REVISIT
public class Shuffle_Array_05 {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans= new int[2*n];

        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
        }


//        for(int i=0;i<= 2*n; i++){
//            if(i%2==0){
//                ans[i] = nums[i];
//            }else{
//                ans[i] = nums[i+(n-1)/2];
//            }
//        }
        return ans;
    }

//    public static int[] shuffle(int[] nums, int n) {
//        int[] ans = new int[n];
//
//        int[] a = new int[n],b = new int[n];
//
////        a=nums[0, n/2];
////        b=nums[n/2, n];
//
//        for (int j = 0; j < 2*n; j++) {
//            if (j%2==0) {
//                a[j]=nums[j];
//            } else {
//                b[j]=nums[j];
//            }
//        }
//
//        for (int i = 0; i < 2 * n; i++) {
//            if (i%2==0) {
//                ans[i]=a[i];
//            } else {
//                ans[i]=b[i];
//            }
//        }
//        return ans;
////        for (int i = 0; i < n/2; i++) {
////            ans[i] = nums[i];
////            for (int j = n/2+1; j < 2*n; j++) {
////                ans[i+1]=nums[j];
////                break;
////            }
////        }
////        return ans;
//    }
    public static void main(String[] args) {

        int[] a = {2,5,1,3,4,7};
        int b=3;

        System.out.println(Arrays.toString(shuffle(a, b)));

    }
}
