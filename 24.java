/**
 * Created by jinxiaobo on 17/2/9.
 * 编程题：
 利用for循环打印 9*9  表
 */

public class Demo{
    public static void main(String args[])
    {
        for(int i=9;i>0;i--)
            for(int j=i-1;j>=0;j--)
                if(j==0)
                    System.out.println(i+"*"+(i-j)+"="+i*(i-j));
                else
                    System.out.print(i+"*"+(i-j)+"="+i*(i-j)+" ");
    }
}