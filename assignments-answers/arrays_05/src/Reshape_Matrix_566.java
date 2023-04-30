import java.util.ArrayList;

public class Reshape_Matrix_566 {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] a = new int[r][c];
        ArrayList<Integer> b = new ArrayList<>(1);

        if(r*c > mat.length){
            return mat;
        }else {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    b.add(mat[i][j]);
                }
            }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    a[i][j] = mat[i][j];
                }
            }







            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = b.get(i);
                }
            }
            return a;
        }

    }
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int r=1, c=4;

        int[][] b = matrixReshape(a, r, c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
