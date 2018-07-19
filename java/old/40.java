/**Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target,
 where index1 must be less than index2.
 Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution and you may not use the same element twice.
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] numbers={2, 7, 11, 15};
        int target=9;
        int[] arr=twoSum(numbers,target);
        for (int i : arr){
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(numbers[left]+numbers[right]!=target) {
            if(numbers[left]+numbers[right]<target)
                left++;
            else
                right--;
        }
        return new int[]{left+1,right+1};
    }
}
