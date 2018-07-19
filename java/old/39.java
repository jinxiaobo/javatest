import java.util.*;

/**Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
 * who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] arr={10,2,8,9,4};
        String[] str=findRelativeRanks(arr);
        for(int i=0;i<str.length;i++)
            System.out.println(str[i]);
    }

    public static String[] findRelativeRanks(int[] nums) {
        int n=nums.length;
        String[] result = new String[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //得分
        for(int i = 0; i < n; ++i){
            map.put(nums[i],i);
        }

        Arrays.sort(nums);//升序排列
        //降序
        for( int i = 0; i < n/2; ++i ) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }


        result[map.get(nums[0])]="Gold Medal";
        if(1 < n) result[map.get(nums[1])] = "Silver Medal";
        if(2 < n) result[map.get(nums[2])] = "Bronze Medal";
        for(int j = 3; j < n; ++j){
            result[map.get(nums[j])] = String.valueOf(j + 1);
        }
        return result;
    }
}
