/**
 * Created by jinxiaobo on 17/2/12.
 * 求1-1/3+1/5-1/7+1/9......的值。

 a,求出前50项和值。

 b,求出最后一项绝对值小于1e-5的和值。*/

public class Demo{
    public static void main(String args[])
    {
        double sum1=0;
        double sum2=0;
        for(double i=0;i<50;i++)
        {
            if(i%2==0)
                sum1=sum1+1/(2*i+1);
            else
                sum1=sum1-1/(2*i+1);
        }
        System.out.println("前50项的和为:"+sum1);
        for(double j=0;;j++)
        {
            if(j%2==0)
                sum2=sum2+1/(2*j+1);
            else
                sum2=sum2-1/(2*j+1);
            if((1/(2*j+1))<1e-5)
                break;
        }
        System.out.println("e-5和为:"+sum2);
    }
}
