public class Sum_Of_N_Natural_Numbers_14 {

    static int Sum_Natural(int n){
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The sum of n natural numbers is " + Sum_Natural(20));
    }
}
