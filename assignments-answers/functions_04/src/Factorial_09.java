public class Factorial_09 {
    static double Factorial(int a){
        double f=1;

        if(a==1 || a==0){
            return 1;
        }else {

            for (int i = 1; i <= a; i++) {
                f *= i;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("The factorial is " + Factorial(0));
    }
}
