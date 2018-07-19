/**Created by jinxiaobo on 17/4/17.
 * Write a function to find the longest common prefix string amongst an array of strings.
 **/


public class Demo {
    public static void main(String[] args) {
        String[] arr = {"abc", "aaa"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) return "";
        String min = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(min) != 0) {
                min = min.substring(0, min.length() - 1);
            }
            i++;
        }
        return min;
    }
}


