/**Created by jinxiaobo on 17/4/20.
 * Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 **/


public class Demo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(reverse(n));
    }
    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = x % 10 + result * 10;
            x /= 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;
        else
            return (int)result;
    }
}


