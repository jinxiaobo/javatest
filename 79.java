/**Created by jinxiaobo on 17/5/17.
 * 在n个物品中挑选若干物品装入背包，最多能装多满？假设背包的大小为m，每个物品的大小为A[i]
 **/


public class Demo {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7};
        System.out.println(backPack(11, arr));
    }
    public static int backPack(int m, int[] A) {
        // write your code here
        int[] dp = new int[m + 1];
        for (int i = 0; i < A.length; i++) {
            for (int j = m; j > 0; j--) {
                if (j >= A[i])
                    dp[j] = Math.max(dp[j], dp[j - A[i]] + A[i]);
            }
        }
        for (int i : dp)
            System.out.println(i);
        return dp[m];
    }
}


