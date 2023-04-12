public class Voting_03 {
    static boolean Voting_Right(int a){
        return a >= 18;
    }
    public static void main(String[] args) {
        if(Voting_Right(12)){
            System.out.println("Can Vote");
        }else{
            System.out.println("Cannot Vote");
        }
    }
}
