import java.util.Arrays;
import java.util.ArrayList;

public class Create_Target_Array_Given_Order_1389 {

        public static  int[] createTargetArray(int[] nums, int[] index) {
            int[] target = new int[nums.length];
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                arr.add(index[i],nums[i]);

            }
            for(int i=0;i<arr.size();i++){
                target[i] = arr.get(i);
            }
            return target;
        }

    public static void main(String[] args) {

    }
}
