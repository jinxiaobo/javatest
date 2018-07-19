/**
 * Created by jinxiaobo on 17/2/9.
 * 编程题：
 编写程序求 1+3+5+7+……+99 的和值
 */

public class Demo{
    public static void main(String args[])
    {
        int sum=0;
        for(int i=1;i<100;i=i+2)
            sum=sum+i;
        System.out.println(sum);
    }
}