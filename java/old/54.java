/**Created by jinxiaobo on 17/3/29.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] nums = {0, 1, 2};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = n * (n + 1) / 2;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }
        return sum1 - sum2;
    }
}
