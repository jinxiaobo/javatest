import java.util.Arrays;

/**AGiven a non-empty integer array of size n,
 * find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1.
 **/

public class Demo{
    public static void main(String args[])
    {
        int[] s={1,2,3,4,5};
        System.out.println(minMoves(s));
    }

    public static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        return sum - nums[0] * nums.length ;
    }

}
