package IO流3;

import java.util.ArrayList;
import java.util.List;

/**Created by jinxiaobo on 17/4/13.
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

 Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

 The order of output does not matter.
 **/


public class Demo {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() == 0 || p.length() == 0) return list;
        int[] arr = new int[26];

        for (char c : p.toCharArray()) {
            arr[c-'a']++;
        }

        int left = 0;
        int right =0;
        int count = p.length();

        while (right < s.length()) {
            if (arr[s.charAt(right) - 'a'] > 0) {
                count--;
            }
            arr[s.charAt(right) - 'a']--;
            right++;

            if (count == 0)
                list.add(left);

            if (right - left == p.length()) {
                if (arr[s.charAt(left) - 'a'] >= 0) {
                    count++;
                }
                arr[s.charAt(left) - 'a']++;
                left++;
            }

        }
        return list;
    }
}


