import java.util.*;

/**Created by jinxiaobo on 17/3/28.
 * Given a string which consists of lowercase or uppercase letters,
 find the length of the longest palindromes that can be built with those letters.
 This is case sensitive, for example "Aa" is not considered a palindrome here.

 Note:
 Assume the length of given string will not exceed 1,010.
 **/

public class Demo{
    public static void main(String args[])
    {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                sum++;
            }
            else
                set.add(s.charAt(i));
        }
        if (set.size() == 0)
            return sum * 2;
        else
            return sum * 2 + 1;
    }
}
