import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//REVISIT
public class Kids_With_Greatest_Number_Candies_1431 {


        public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxCandies = 0;
            for (int candy : candies) {
                maxCandies = Math.max(maxCandies, candy);
            }

            ArrayList<Boolean> result = new ArrayList<>();

            for (int candy : candies) {
                if (candy + extraCandies >= maxCandies) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }

            return result;
        }

//    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int max=Integer.MIN_VALUE, low=Integer.MAX_VALUE;
//
//        ArrayList<Boolean> result = new ArrayList<>(1);
//
//        for (int i = 0; i < candies.length; i++) {
//            if(max<candies[i]+extraCandies || low>=candies[i]+extraCandies){
//                result.add(true);
//            }else {
//                low = candies[i]+extraCandies;
//                result.add(false);
//            }
//        }
//        return result;
//    }

//    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        boolean greatest = false;
//        int max=0, lowest=Integer.MIN_VALUE;
//
//        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
//
//        for (int i = 0; i < candies.length; i++) {
//            if(max<=candies[i]+extraCandies || lowest<=candies[i]+extraCandies){
//                max=candies[i]+extraCandies;
////                greatest = true;
//                result.add(true);
//            }else {
//                result.add(false);
//                lowest = candies[i]+extraCandies;
//            }
//        }
//        return result;
//    }
    public static void main(String[] args) {
        int[] a = {2,3,5,1,3};
        int b = 3;
        System.out.println(kidsWithCandies(a,b));
    }
}
