/**
 * Created by jinxiaobo on 17/1/29.
 * 编程题：
 获取一个子串在字符串中出现的次数
 */
public class Demo {
    public static void main(String[] args)
    {
        String str="abcdhsgnbadyeuajshnba";
        String key="nba";
        int count=GetCount(str,key);
        System.out.print(count);
    }

    private static int GetCount(String str, String key)
    {
        int count=0;
        int index=0;
        while((index=str.indexOf(key))!=-1)
        {
            str=str.substring(index+key.length());
            count++;
        }
        return count;
    }

}
