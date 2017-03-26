/**Created by jinxiaobo on 17/3/26.
 * Given an integer, return its base 7 string representation.
 **/

public class Demo{
    public static void main(String args[])
    {
        int num = -7;
        System.out.println(convertToBase7(num)+"");
    }
    public static String convertToBase7(int num) {
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        if (num < 0)
            flag = true;
        if (num == 0)
            return num + "";
        while (num != 0) {
            sb.append(Math.abs(num) % 7);
            num = Math.abs(num) / 7;
        }
        if (flag) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
