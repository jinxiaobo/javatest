/**Created by jinxiaobo on 17/5/18.
 * 假设你是一个专业的窃贼，准备沿着一条街打劫房屋。每个房子都存放着特定金额的钱。你面临的唯一约束条件是：
 * 相邻的房子装着相互联系的防盗系统，且 当相邻的两个房子同一天被打劫时，该系统会自动报警。

 给定一个非负整数列表，表示每个房子中存放的钱， 算一算，如果今晚去打劫，你最多可以得到多少钱 在不触动报警装置的情况下。
 给定 [3, 8, 4], 返回 8.

 思路：一个动态规划问题，前n个房子所获得的最大金额可表示为取（前n-1个房子所获得的最大金额）与（前n-2个房子所获得的最大金额加上第n个房子所获得的金额之和）之间较大的那个。
 状态方程：f[n]=max(f[n-1],f[n-2]+money[n])；
 n表示第n个房子,n-1表示上一个房子,n-2表示上上一个房子。
 
 f[n]表示打劫前n个房子所获得的最大金额。
 **/


public class Demo {
    public static void main(String[] args) {
        int[] nums = {3,8,4};
        System.out.println(houseRobber(nums));
    }
    public static long houseRobber(int[] nums) {
        // write your code here
        int len = nums.length;
        if (nums == null || len == 0)
            return 0;
        long[] dp = new long[len];
        for (int i = 0; i < len; i++) {
            if (i == 0)
                dp[i] = nums[0];
            if (i == 1)
                dp[i] = Math.max(nums[0], nums[1]);
            else if (i > 1)
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[len - 1];
    }
}


