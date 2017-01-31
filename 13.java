/**
 * Created by jinxiaobo on 17/1/31.
 * 编程题：
 对这个字符串数组进行字典顺序的排序
 */
public class Demo {
    public static void main(String[] args)
    {
        String str[]={"aaa","abc","cba","nba","qq","zz"};
        SortString(str);
        for(int i=0;i<str.length;i++)
            System.out.print(str[i]+",");
    }
    private static void SortString(String[] str)
    {
       for(int i=0;i<str.length-1;i++)
           for(int j=i+1;j<str.length;j++)
           {
                if(str[i].compareTo(str[j])>0)
                    swap(str,i,j);
           }
    }
    private static void swap(String[] str, int i, int j)
    {
        String temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }
}