/**
 * Created by jinxiaobo on 17/3/7.
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

 We define the usage of capitals in a word to be right when one of the following cases holds:

 All letters in this word are capitals, like "USA".
 All letters in this word are not capitals, like "leetcode".
 Only the first letter in this word is capital if it has more than one letter, like "Google".
 Otherwise, we define that this word doesn't use capitals in a right way.Given a binary array,
 find the maximum number of consecutive 1s in this array.
 */

public class Demo{
    public static void main(String args[])
    {
        String s="Google";
        System.out.println(detectCapitalUse(s));
    }
    public static boolean detectCapitalUse(String word) {
        char[] chararr=word.toCharArray();
        if(word.length()==1)
            return true;
        if (chararr[0]>=65&&chararr[0]<=90) {
            if(chararr[1]>=65&&chararr[1]<=90) {
                if(word.length()==2)
                    return true;
                else {
                    for (int i = 2; i < word.length(); i++) {
                        if (chararr[i] >= 65 && chararr[i] <= 90)
                            continue;
                        else
                            return false;
                    }
                    return true;
                }
            }
            else{
                for (int i = 2; i < word.length(); i++) {
                    if (chararr[i] >= 97 && chararr[i] <= 122)
                        continue;
                    else
                        return false;
                }
                return true;
            }
        }
        else if(chararr[0]>=97&&chararr[0]<=122){
            for(int i=1;i<word.length();i++) {
                if(chararr[i] <97 || chararr[i] > 122)
                    return false;
                else
                    continue;
            }
            return true;
        }
        else
            return false;
    }
}

