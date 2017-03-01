/**
 * Created by jinxiaobo on 17/3/1.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class Demo{
    public static void main(String args[])
    {
        int[] arr={3,2,4};
        twoSum(arr,6);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        return null;
    }
}