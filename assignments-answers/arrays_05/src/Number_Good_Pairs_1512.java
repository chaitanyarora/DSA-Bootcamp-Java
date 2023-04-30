public class Number_Good_Pairs_1512 {

        public static int numIdenticalPairs(int[] nums) {
            int no = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    if(nums[i] == nums[j] && i<j){
                        no++;
                    }
                }
            }
            return no;
        }
        public static void main(String[] args) {
            int[] a = {1,2,3,1,1,3};

            int b = numIdenticalPairs(a);
            System.out.println(b);
        }
}
