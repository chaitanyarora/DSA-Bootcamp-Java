package intermediate_java_programs;

import java.util.Scanner;

public class Calculate_CGPA_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int no_of_subjects = in.nextInt();

        float a = in.nextFloat();
        float b = in.nextFloat();

        double c = a*b/no_of_subjects;

//        for(int i=0; i<no_of_subjects; i++){
//            String a = in.nextLine().toUpperCase();
//
//            if(a.equals("MATHS")){
//                float m = in.nextFloat();
//                float m_credit = in.nextFloat();
//            } else if (a.equals("ENGLISH")) {
//                float e = in.nextFloat();
//                float e_credit = in.nextFloat();
//            }
//
//
//        }
    }
}
