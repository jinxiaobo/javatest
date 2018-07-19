/**Created by jinxiaobo on 17/3/30.
 * Given an integer, write a function to determine if it is a power of three.

 Follow up:
 Could you do it without using any loop / recursion?
 **/

public class Demo{
    public static void main(String args[])
    {
        int num = 27;
        System.out.println(isPowerOfThree(num));
    }
    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
