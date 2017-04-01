/**Created by jinxiaobo on 17/3/30.
 * Given an integer, write a function to determine if it is a power of three.

 Follow up:
 Could you do it without using any loop / recursion?
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] nums = {1};
        System.out.println(searchInsert(nums, 2));
    }
    public static int searchInsert(int[] nums, int target) {
        if (target <= nums[0])
            return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (target > nums[i] && target <= nums[i + 1])
                return i + 1;
        }
        return nums.length;
    }
}

