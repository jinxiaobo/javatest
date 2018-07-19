package IO流3;

import java.util.HashMap;
import java.util.Map;

/**Created by jinxiaobo on 17/4/13.
 * Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. 
 No two characters may map to the same character but a character may map to itself.
 **/


public class Demo {
    public static void main(String[] args) {
        String s = "ab";
        String t = "aa";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() == 0 && t.length() == 0) return true;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (!(map.get(a) == b))
                    return false;
            }
            else {
                if (!map.containsValue(b))
                map.put(a, b);
                else return false;
            }
        }
        return true;
    }
}


