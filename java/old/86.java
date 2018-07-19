/**Created by jinxiaobo on 17/5/22.
 * Given a sequence of n integers a1, a2, ..., an, a 132 pattern is a subsequence ai, aj, ak
 * such that i < j < k and ai < ak < aj. Design an algorithm that takes a list of n numbers as input
 * and checks whether there is a 132 pattern in the list.
 **/


public class Demo {
    public static void main(String[] args) {
        int[] nums = {3,6,4};
        System.out.println(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {
        for (int j = 0, min = Integer.MAX_VALUE; j < nums.length; j++) {
            min = Math.min(nums[j], min);
            if (min == nums[j])
                continue;

            for (int k = nums.length - 1; k > j; k--) {
                if (min < nums[k] && nums[k] < nums[j]) 
                    return true;
            }
        }
        return false;
    }
}


