import java.util.*;

/**Created by jinxiaobo on 17/3/28.
 * A binary watch has 4 LEDs on the top which represent the hours (0-11),
 * and the 6 LEDs on the bottom represent the minutes (0-59).

 Each LED represents a zero or one, with the least significant bit on the right.

 For example, the above binary watch reads "3:25".

 Given a non-negative integer n which represents the number of LEDs that are currently on,
 return all possible times the watch could represent.
 **/

public class Demo{
    public static void main(String args[])
    {
        int num = 1;
        System.out.println(readBinaryWatch(num));
    }
    public static List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int h = 0; h < 12; h++)
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h * 64 + m) == num)
                    list.add(String.format("%1d:%02d", h, m));
            }
        return list;
    }
}
