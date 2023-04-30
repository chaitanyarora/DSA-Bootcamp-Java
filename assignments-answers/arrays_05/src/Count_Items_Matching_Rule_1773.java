import java.util.*;

public class Count_Items_Matching_Rule_1773 {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;

        for (int i=0; i<items.size(); i++) {

            if(ruleKey.equals("type")){
                if(items.get(i).equals(ruleValue)){
                    count++;
                }
            } else if (ruleKey.equals("color")) {
                if(items.get(i).equals(ruleValue)){
                    count++;
                }

            } else if (ruleKey.equals("name")) {
                if(items.get(i).equals(ruleValue)){
                    count++;
                }
            }

        }
        return count;

    }

    public static void main(String[] args) {



    }
}
