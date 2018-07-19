/**Created by jinxiaobo on 17/5/17.
 * 给出n个物品的体积A[i]和其价值V[i]，将他们装入一个大小为m的背包，最多能装入的总价值有多大？
 **/


public class Demo {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7};
        int[] val = {1,5,2,4};
        System.out.println(backPack(11, arr, val));
    }
    public static int backPack(int m, int[] A, int[] V) {
        // write your code here
        int[] dp = new int[m + 1];
        for (int i = 0; i < A.length; i++) {
            for (int j = m; j > 0; j--) {
                if (j >= A[i])
                    dp[j] = Math.max(dp[j], dp[j - A[i]] + V[i]);
            }
        }
        return dp[m];
    }
}


