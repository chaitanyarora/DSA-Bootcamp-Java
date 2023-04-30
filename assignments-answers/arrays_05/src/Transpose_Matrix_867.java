public class Transpose_Matrix_867 {
    public static int[][] transpose(int[][] matrix) {
        int maxNum = 0;
        // calculate how much memory needed
        for(int i = 0;i < matrix.length; i++) {
            maxNum++;
        }

        int[][] a = new int[maxNum][];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                a[i][j] = matrix[j][i];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[][] b = {{1,2,3}, {4,5,6}, {7,8,9}};

        int[][] a = transpose(b);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

//    public int[][] transpose(int[][] matrix) {
//        int row=matrix.length;
//        int col=matrix[0].length;
//        int arr[][]=new int[col][row];
//        for(int i=0;i<col;i++)
//        {
//            for(int j=0;j<row;j++)
//            {
//                arr[i][j]=matrix[j][i];
//            }
//        }
//        return arr;
//    }