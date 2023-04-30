import java.util.ArrayList;
import java.util.List;
//REVISIT
public class Spiral_Matrix_54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a = new ArrayList<Integer>(1);

        int rowBegin = 0, colBegin = 0;
        int rowEnd = matrix.length-1, colEnd = matrix[0].length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for (int i = colBegin; i <= colEnd; i++) {
                a.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                a.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd){
                for (int i = colEnd; i >= colBegin; i--) {
                    a.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if(colBegin <= colEnd){
                for (int i = rowEnd; i >= rowBegin; i--) {
                    a.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return a;

    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        System.out.println(spiralOrder(a));
    }
}
