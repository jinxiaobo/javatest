/**Created by jinxiaobo on 17/4/5.
 * Write a function that takes a string as input and reverse only the vowels of a string.
 **/

public class Demo{
    public static void main(String args[])
    {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int l = 0;
        int r = n - 1;
        char temp;
        while (l < r) {
            if (isvowel(arr[l])) {
                if (isvowel(arr[r])) {
                    temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }
                else
                    r--;
            }
            else
                l++;
        }
        return String.valueOf(arr);
    }
    public static boolean isvowel(char ch) {
        switch (ch) {
            case 65 : return true;
            case 69 : return true;
            case 73 : return true;
            case 79 : return true;
            case 85 : return true;
            case 97 : return true;
            case 101 : return true;
            case 105 : return true;
            case 111 : return true;
            case 117 : return true;
            default: return false;
        }
    }
}

