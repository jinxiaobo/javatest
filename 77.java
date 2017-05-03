/**Created by jinxiaobo on 17/5/3.
 * Determine whether an integer is a palindrome. Do this without extra space.
 **/


public class Demo {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int copyX = x;
        long result = 0;
        while (x != 0) {
            result = x % 10 + result * 10;
            x /= 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return false;
        else
            return (result == copyX);
    }
}


