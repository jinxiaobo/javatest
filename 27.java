/**
 * Created by jinxiaobo on 17/2/12.
 * 编程题：
 求 2/1+3/2+5/3+8/5+13/8.....前20项之和
 */

public class Demo{
    public static void main(String args[])
    {
        double sum=0;
        double fenzi=2;
        double fenmu=1;
        for(int i=0;i<20;i++)
        {
            sum+=fenzi/fenmu;
            double temp=fenzi;
            fenzi+=fenmu;
            fenmu=temp;
        }
        System.out.println("和为:"+sum);
    }
}