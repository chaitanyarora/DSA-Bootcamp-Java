public class How_Many_Numbers_Smaller_Than_Current_Number_1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i] && j!=i){
                    count++;
                }
            }
            answer[i]=count;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {8,1,2,2,3};

        System.out.println(smallerNumbersThanCurrent(a));
    }
}
