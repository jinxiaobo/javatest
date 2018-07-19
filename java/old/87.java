/**Created by jinxiaobo on 17/5/22.
 * 给出一个非负整数数组，你最初定位在数组的第一个位置。　　　

 数组中的每个元素代表你在那个位置可以跳跃的最大长度。　　　　

 判断你是否能到达数组的最后一个位置。
 首先来看一下如何使用动态规划求解该问题。使用动态规划求解问题，首先需要找到问题的状态和状态转化方程

 假设问题的状态，假设位置i(0≤i≤A.length)能够跳跃的最大长度为dp[i]。
 对于数组A = [2,3,1,1,4]， 则有：
 i = 0, dp[0] = A[0] + 0 = 2
 i = 1, if dp[i-1] = dp[0]≥ i then dp[1] = max{A[1]+1,dp[0]}=4 else dp[1] = 0
 i = 2, if dp[i-1] = dp[1] ≥ i then dp[2] = max{A[2]+2,dp[1]} = 4 else dp[2] = 0

 基于上面的分析，其状态转换方程为：
 dp[i]={max{A[i]+i,dp[i−1]},if dp[i−1]≥i     0,otherwise
 **/


public class Demo {
    public static void main(String[] args) {
        int[] nums = {3,6,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] A) {
        // wirte your code here
        if (A.length == 1)
            return true;
        int len = A.length;
        int[] dp = new int[len];
        dp[0] = A[0];
        for (int  i = 1; i < len; i++) {
            if (dp[i - 1] >= i)
                dp[i] = Math.max(dp[i - 1], A[i] + i);
            else
                dp[i] = 0;
        }
        return dp[len - 1] >= len - 1;
    }
}


