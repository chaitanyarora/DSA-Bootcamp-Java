import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//REVISIT

public class Lucky_Numbers_Matrix_1380 {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> m = new ArrayList<>(0);
        int[] b = new int[matrix.length];
        int[] c = new int[matrix[0].length];

        Arrays.fill(b, Integer.MAX_VALUE);


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                b[i] = Math.min(matrix[i][j], b[i]);
                c[j] = Math.max(matrix[i][j], c[j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(b[i] == c[j]){
                    m.add(b[i]);
                }
                break;

            }
        }
        return m;
    }
    public static void main(String[] args) {
        int[][] a = {{1,10,4,2}, {9,3,8,7}, {15,16,17,12}};

        System.out.println(Arrays.toString(luckyNumbers(a).toArray()));

    }
}
