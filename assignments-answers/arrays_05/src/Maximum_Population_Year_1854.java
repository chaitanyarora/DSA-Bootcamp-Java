
//DIDN'T SOLVE
public class Maximum_Population_Year_1854 {

    public static int maximumPopulation(int[][] logs) {
        int count=0;

        for (int i = 0; i < logs.length; i++)
            if (logs[i][0] >= logs[i][1]) {
                count++;
            }
        return logs[count][0];
    }
    public static void main(String[] args) {
        int[][] logs = {{1993,1999}, {2000,2010}};

        System.out.println(maximumPopulation(logs));
    }
}
