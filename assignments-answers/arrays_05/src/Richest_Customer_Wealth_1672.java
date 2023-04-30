public class Richest_Customer_Wealth_1672 {

    public static int maximumWealth(int[][] accounts) {

        int max=0, m=accounts.length;

        for (int i = 0; i < m; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(max < sum){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,2,1}};
        int b = maximumWealth(a);

        System.out.println(b);
    }
}
