import java.util.HashSet;
import java.util.Set;

/**Created by jinxiaobo on 17/3/29.
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: 
 * Starting with any positive integer, replace the number by the sum of the squares of its digits, 
 * and repeat the process until the number equals 1 (where it will stay), 
 * or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers.
 **/

public class Demo{
    public static void main(String args[])
    {
        int num = 19;
        System.out.println(isHappy(num));
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        int sum = 0;
        while (set.add(n)) {
            sum = 0;
            while (n > 0) {
                result = n % 10;
                sum += result * result;
                n = n / 10;
            }
            if (sum == 1)
                return true;
            else
                n = sum;
        }
        return false;
    }
}
