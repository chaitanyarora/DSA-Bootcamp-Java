public class Odd_Even_02 {

    static String Odd_Even(int a){
        if(a%2==0){
            return "Even";
        } else{
            return "Odd";
        }
    }
    public static void main(String[] args) {
        String b = Odd_Even(4);
        System.out.println(b);
    }
}
