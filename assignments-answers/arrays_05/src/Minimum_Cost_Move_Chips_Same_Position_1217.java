//REVISIT

public class Minimum_Cost_Move_Chips_Same_Position_1217 {

    public static int minCostToMoveChips(int[] position) {
        int count = 0;

        for (int i = 0; i < position.length; i++) {
            if(position[i]%2 == 0)
                count++;
        }
        return Math.min(count, position.length-count);
    }
    public static void main(String[] args) {
        int[] a = {2,2,2,3,3};

        System.out.println(minCostToMoveChips(a));

    }
}
