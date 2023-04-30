import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Check_Sentence_Pangram_1832 {
    public static boolean checkIfPangram(String sentence) {

        String[] a = sentence.split("");

        String[] b = "abcdefghijklmnopqrstuvwxyz".split("");

        List<String> wordList = Arrays.asList(a);

        for (int i = 0; i < b.length; i++) {
            if(!wordList.contains(b[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
