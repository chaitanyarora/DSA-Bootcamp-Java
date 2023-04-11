import java.util.Scanner;

public class Area_Equilateral_Triangle_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float side = in.nextFloat();


        double area = Math.sqrt(3)*1/4*Math.pow(side, 2);

        System.out.println("The area of a equilateral trianlge is " + area);
    }
}
