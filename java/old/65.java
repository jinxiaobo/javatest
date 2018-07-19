/**Created by jinxiaobo on 17/4/7.
 * You have a total of n coins that you want to form in a staircase shape,
 where every k-th row must have exactly k coins.

 Given n, find the total number of full staircase rows that can be formed.

 n is a non-negative integer and fits within the range of a 32-bit signed integer.
 **/

public class Demo{
    public static void main(String args[])
    {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        int count = 1;
        if (n == 0)
            return 0;
        while (n >= count) {
            n -= count;
            count++;
        }
        return count - 1;
    }
}

