/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 获取两个字符串中最大相同子串
 */
public class Demo {
    public static void main(String[] args)
    {
        String s1="abcdhsgnbadycctveuajshnba";
        String s2="sjajjcbjhcctv";
        String str=GetSubstring(s1,s2);
        System.out.print(str);
    }

    private static String GetSubstring(String s1, String s2)
    {
        String max=s1.length()>s2.length()?s1:s2;
        String min=max.equals(s1)?s2:s1;
        for(int i=0;i<min.length();i++)
            for(int j=0,k=min.length()-i;k<min.length()+1;j++,k++)
        {
            String temp=min.substring(j,k);
            if(max.contains(temp))
            {
                return temp;
            }
        }
        return null;
    }
}