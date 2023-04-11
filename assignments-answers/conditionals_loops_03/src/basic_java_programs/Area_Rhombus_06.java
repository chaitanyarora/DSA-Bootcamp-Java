import java.util.Scanner;

public class Area_Rhombus_06 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            String using = in.nextLine();


            if(using.equals("base") || using.equals("height")){
                float height = in.nextFloat();
                float base = in.nextFloat();

                double area = (height*base);
                System.out.println("The area of rhombus is " + area + "sq. units");

            }
            else {
                float diagonal1 = in.nextFloat();
                float diagonal2 = in.nextFloat();

                double area = (diagonal1*diagonal2)*0.5;
                System.out.println("The area of rhombus is " + area + "sq. units");

            }



        }
    }
