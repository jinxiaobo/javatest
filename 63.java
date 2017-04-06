/**Created by jinxiaobo on 17/4/6.
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 **/

public class Demo{
    public static void main(String args[])
    {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}

