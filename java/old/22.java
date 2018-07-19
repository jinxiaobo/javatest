/**
 * Created by jinxiaobo on 17/2/6.
 * 编程题：
 编写程序，判断给定的某个年份是否是闰年。
 闰年的判断规则如下：
 （1）若某个年份能被4整除但不能被100整除，则是闰年。
 （2）若某个年份能被400整除，则也是闰年。
 */

import java.util.Scanner;

public class Demo{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year<0||year>3000)
            System.out.println("输入年份有误!");
        else if(year%400==0)
            System.out.println("闰年");
        else if((year%4==0)&&(year%100>0))
            System.out.println("闰年");
        else
            System.out.println("非闰年");
    }
}