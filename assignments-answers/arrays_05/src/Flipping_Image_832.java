import java.util.Arrays;

public class Flipping_Image_832 {

    public static void main(String[] args) {
        int[][] image = {{1,1,0,9}, {1,0,1,9}, {0,0,0,1}};


        for (int k = 0; k < image.length; k++) {
            int i=0, j=image.length;

            while(i<=j){
                int temp = image[k][j];
                image[k][j] = image[k][i];
                image[k][i] = temp;
                i++;
                j--;
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else {
                    image[i][j] = 0;
                }
            }
        }

        for (int l = 0; l < image.length; l++) {
            System.out.print(Arrays.toString(image[l]));
        }

    }
}