/**Created by jinxiaobo on 17/3/26.
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 **/

public class Demo{
    public static void main(String args[])
    {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return i;
            else
                continue;
        }
        return -1;
    }
}
