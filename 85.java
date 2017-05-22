import java.util.Arrays;

/**Created by jinxiaobo on 17/5/22.
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 * then the whole array will be sorted in ascending order, too.

 You need to find the shortest such subarray and output its length.
 Input: [2, 6, 4, 8, 10, 9, 15]
 Output: 5
 Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 **/


public class Demo {
    public static void main(String[] args) {
        int[] nums = {3,6,4};
        System.out.println(findUnsortedSubarray(nums));
    }
    public static int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int[] temp = new int[len];
        for (int i = 0; i < len; i++)
            temp[i] = nums[i];
        Arrays.sort(nums);
        while (right >= left) {
            if (right == left)
                return 0;
            if (nums[left] == temp[left])
                left++;
            if (nums[right] == temp[right])
                right--;
            else if (nums[left] != temp[left] && nums[right] != temp[right])
                break;
        }
        return right - left + 1;
    }
}


