public class Cells_Odd_Values_Matrix_1252 {
    //REVISIT
    public static int oddCells(int m, int n, int[][] indices) {
        int a[][] = new int[indices.length][];
        int b[][] = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
                for (int k = 0; k < n; k++) {
                    b[indices[i][0]][k]++;
                }
                
                for (int k = 0; k < m; k++) {
                    b[k][indices[i][1]]++;
                }
            }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int count = 0;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if(b[i][j]%2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[][] a = {{0,1}, {1,1}};
        int b = 2, c = 3;

        System.out.println(oddCells(b, c, a));

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

    }
}
