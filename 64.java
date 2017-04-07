/**Created by jinxiaobo on 17/4/7.
 * Count the number of segments in a string,
 * where a segment is defined to be a contiguous sequence of non-space characters.

 Please note that the string does not contain any non-printable characters.
 **/

public class Demo{
    public static void main(String args[])
    {
        String s = "    foo    bar";
        System.out.println(countSegments(s));
    }
    public static int countSegments(String s) {
        if (s.equals(""))
            return 0;
        else if (s.startsWith(" "))
            return s.split(" {1,}").length - 1 >= 0 ? s.split(" {1,}").length - 1 : 0;
        return s.split(" {1,}").length;
    }
}

