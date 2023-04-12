public class Pythagorean_Triplet_12 {
    static String Pythagorean(int a, int b, int c){
        if(a*a + b*b == c*c){
            return "Yes";
        }
        if(c*c + b*b == a*a){
            return "Yes";
        }
        if(a*a + c*c == b*b){
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        System.out.println("Is this a Pythagorean Triplet " + Pythagorean(6,3,9));
    }
}
