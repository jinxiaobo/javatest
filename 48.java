import java.util.Arrays;

/**Created by jinxiaobo on 17/3/27.
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] nums ={1};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}
