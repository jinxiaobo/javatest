/**Created by jinxiaobo on 17/4/14.
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.

 If the last word does not exist, return 0.
 **/


public class Demo {
    public static void main(String[] args) {
        String s = "a ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        if (s.length() == 0)return 0;
        char[] arr = s.toCharArray();
        int len = arr.length;
        int count  = 0;
        while (len > 0 && Character.isWhitespace(arr[len - 1])) {
            len--;
        }
        while (len > 0 && !Character.isWhitespace(arr[len - 1])) {
            count++;
            len--;
        }
        return count;
    }
}


