/**Created by jinxiaobo on 17/4/1.
 * Given a non-empty string check if it can be constructed by taking a substring of it
 * and appending multiple copies of the substring together.
 * You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

 **/

public class Demo{
    public static void main(String args[])
    {
        String s = "abcabc";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {
        int l =s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                String subS = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int m = 0; m < l / i; m++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}

