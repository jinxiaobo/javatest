/**Created by jinxiaobo on 17/4/10.
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.
 **/


public class Demo {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i - 1]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}


