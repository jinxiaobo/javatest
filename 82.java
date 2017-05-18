/**Created by jinxiaobo on 17/5/18.
 * 我们有一个栅栏，它有n个柱子，现在要给柱子染色，有k种颜色可以染。必须保证最多只有两个相邻的柱子颜色相同，求有多少种染色方案。
 样例：n = 3, k = 2, return 6
 **/


public class Demo {
    public static void main(String[] args) {
        int n = 3;
        int k =2;
        System.out.println(numWays(n, k));
    }
    public static int numWays(int n, int k) {
        // Write your code here
        if (n == 0 || k ==0)
            return 0;
        int[] dp = new int[n + 1];
        dp[0] = k;
        dp[1] = k * k;
        for (int  i = 2; i < n; i++) {
            dp[i] = dp[i - 1] * (k - 1) + dp[i - 2] * (k - 1);
        }
        return dp[n - 1];
    }
}


