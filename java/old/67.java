/**Created by jinxiaobo on 17/4/12.
 * Determine whether an integer is a palindrome. Do this without extra space.
 **/


public class Demo {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int p = x;
        int q = 0;

        while (p >= 10){
            q *=10;
            q += p%10;
            p /=10;
        }

        return q == x / 10 && p == x % 10;
    }
}

