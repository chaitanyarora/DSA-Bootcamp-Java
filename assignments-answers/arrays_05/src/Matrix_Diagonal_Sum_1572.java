public class Matrix_Diagonal_Sum_1572 {

    public static int diagonalSum(int[][] mat) {
        int sum=0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==j){
                    sum += mat[i][j];

                }
            }
        }

        int i=0, j=mat.length-1;

        while(i<= mat.length && j>=0){
            if(i != j){
                sum += mat[i][j];

            }
            i++;
            j--;
        }
        return sum;
    }
    public static void main(String[] args) {

        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(diagonalSum(a));


    }
}
