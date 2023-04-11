import java.util.Scanner;

public class Volume_Prism_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float height = in.nextFloat();
        float base = in.nextFloat();

        double area = height*base;

        System.out.println("The volume of the prism is " + area);
    }
}

// volume = height * base