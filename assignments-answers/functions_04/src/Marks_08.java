public class Marks_08 {

    static String Marks(int a){
        if(a > 90 && a <= 100){
            return "AA";
        } else if (a > 80 && a <= 90) {
            return "AB";
        }else if (a > 70 && a <= 80) {
            return "BB";
        }else if (a > 60 && a <= 70) {
            return "BC";
        }else if (a > 50 && a <= 60) {
            return "CD";
        }else if (a > 40 && a <= 50) {
            return "DD";
        }else if (a <= 40) {
            return "FAIL";
        }
        return null;
    }
    public static void main(String[] args) {

        System.out.println("The grade is " + Marks(22));

    }
}
