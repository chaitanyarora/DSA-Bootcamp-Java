import java.util.Scanner;

public class Volume_Pyramid_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float pyramidheight = in.nextFloat();
        float baselength = in.nextFloat();
        float basewidth = in.nextFloat();

        double area = (pyramidheight*baselength*basewidth)/3;

        System.out.println("The volume of the right rectangular is " + area);
    }
}
