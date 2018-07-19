/**
 * Created by jinxiaobo on 17/2/9.
 * 编程题：
 输出所有的水仙花数，把谓水仙花数是指一个数3位数，其各各位数字立方和等于其本身
 */

public class Demo{
    public static void main(String args[])
    {
        for(int num=100;num<1000;num++)
        {
            int i=num/100;
            int j=(num-i*100)/10;
            int k=num-i*100-j*10;
            int sum=i*i*i+j*j*j+k*k*k;
            if(sum==num)
                System.out.println(num+"是水仙花数");
        }

    }
}