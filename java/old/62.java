import java.util.Arrays;

/**Created by jinxiaobo on 17/4/5.
 * Write a function that takes a string as input and reverse only the vowels of a string.(数组返回顺序要一致)
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] nums = {1};
        System.out.println(removeElement(nums, 1));
    }
    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        if (right < 0)
            return 0;
        while (left <= right) {
            if (nums[left] == val) {
                if (nums[right] == val)
                    return left;
                else {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                }
            }
            else
                left++;
        }
        return right + 1;
    }
}

