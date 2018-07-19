import java.util.HashMap;
import java.util.Map;

/**Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.

 Each letter in the magazine string can only be used once in your ransom note.

 Note:
 You may assume that both strings contain only lowercase letters.
 **/

public class Demo{
    public static void main(String args[])
    {
        String a="aa";
        String b="aab";
        System.out.println(canConstruct(a,b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magM = new HashMap<>();
        for (char c : magazine.toCharArray()){
            int count = magM.getOrDefault(c, 0) + 1;
            magM.put(c, count);
        }
        for (char c : ransomNote.toCharArray()){
            int count = magM.getOrDefault(c, 0) - 1;
            if(count < 0)
                return false;
            magM.put(c, count);
        }
        return true;
    }
}
