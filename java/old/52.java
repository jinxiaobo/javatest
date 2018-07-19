import java.util.*;

/**Created by jinxiaobo on 17/3/28.
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] nums = {1,1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }
}
