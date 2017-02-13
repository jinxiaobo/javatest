import java.util.Scanner;

/**
 * Created by jinxiaobo on 17/2/12.
 * 编程题：
 求a+aa+aaa+.......+aaaaaaaaa
 */

public class Demo{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入a的值:a=");
        int a=scanner.nextInt();
        System.out.println("输入a的个数:x=");
        int x=scanner.nextInt();
        int a1=0;
        int sum=0;
        for(int i=0;i<x;i++)
        {
            a1=a1*10+a;
            sum=sum+a1;
        }
        System.out.println("和为:"+sum);
    }
}