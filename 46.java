/**Created by jinxiaobo on 17/3/26.
 * Related to question Excel Sheet Column Title
   A:65 Z:90
   Given a column title as appear in an Excel sheet, return its corresponding column number.
 **/

public class Demo{
    public static void main(String args[])
    {
        String s = "AAA";
        System.out.println(titleToNumber(s));
    }
    public static int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 26 + s.charAt(i) - 'A' + 1;
        }
        return sum;
    }
}
