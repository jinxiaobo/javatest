/**Created by jinxiaobo on 17/5/16.
 * Determine whether an integer is a palindrome. Do this without extra space.
 **/


public class Demo {
    public static void main(String[] args) {
        System.out.println(myAtoi(" 011 "));
        //System.out.println(('-');
    }
    public static int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;
        str = str.trim();
        char firstChar = str.charAt(0);
        int sign = 1;
        int start = 0;
        long sum = 0;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }
        for (int i = start; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                return (int)sum * sign;
            sum = sum * 10 +str.charAt(i) - '0';
            if (sign == 1 && sum > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int)sum * sign;
    }
}


