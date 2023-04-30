//REVISIT
public class Determine_Whether_Matrix_Can_Rotation_1886 {

    public static boolean findRotation(int[][] mat, int[][] target) {
        int[][] a = new int[mat.length][mat.length];
        boolean m = false;

        for (int n = 0; n < 5; n++) {

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    a[j][i] = mat[i][j];
                }
            }

            for (int i = 0; i < mat.length; i++) {
                mat[i][0] = a[i][mat.length-1];
            }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }

            for (int i = 0; i < target.length; i++) {
                for (int j = 0; j < target.length; j++) {
                    if(target[i][j] != mat[i][j])
                        m = false;
                }
            }
            m = true;

            if(m==true)
                return m;
        }
        return m;
    }
    public static void main(String[] args) {
        int[][] a = {{0,1},{1,1}}, b = {{1,0},{0,1}};
        boolean yo = findRotation(a, b);
        System.out.println(yo);
    }
}
