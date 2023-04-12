public class Area_Circumference_06 {

    static final float PI = 3.14F;
    static void Circle_Operations(int r){
        System.out.println("The area is "+PI*r*r);
        System.out.println("The circumference is "+2*PI*r);
    }
    public static void main(String[] args) {
        Circle_Operations(6);
    }
}
