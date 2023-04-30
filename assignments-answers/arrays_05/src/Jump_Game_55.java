public class Jump_Game_55 {
//REVISIT
    public static boolean canJump(int[] nums) {

//        boolean flag=true;
//        int i=0;
//
//        while(flag || i > nums.length){
//            if(i == nums.length-1)
//                return flag;
//            i += nums[i];
//        }
//        return false;
        for (int i = 0; i < nums.length;) {
            if(i == nums.length-1){
                return true;
            }
            i += nums[i];
            if(i > nums.length || nums[i] == 0)
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {3,2,1,0,4};

        System.out.println(canJump(a));
    }
}
