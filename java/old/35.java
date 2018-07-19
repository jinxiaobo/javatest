/**
 * Created by jinxiaobo on 17/3/6.
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */

public class Demo{
    public static void main(String args[])
    {
        int[] arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int MaxSum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                sum++;
                if(sum>MaxSum)
                {
                    MaxSum = sum;
                }
            }
            else
            {
                sum=0;
            }
        }
        return MaxSum;
    }
}

