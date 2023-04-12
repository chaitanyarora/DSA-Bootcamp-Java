public class Prime_07 {

    static boolean Prime_Not(int a){
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println("Prime "+Prime_Not(8));
    }
}
