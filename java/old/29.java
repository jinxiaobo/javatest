/**
 * Created by jinxiaobo on 17/2/18.
 * 判断随机整数是否是素数

 产生100个0-999之间的随机整数，然后判断这100个随机整数哪些是素数，哪些不是？*/

public class Demo{
    public static void main(String args[])
    {
        for(int i=0;i<100;i++)
        {
            int num = (int)(Math.random() * 1000);
            int count=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                    count+=1;
            }
            if(count==2)
                System.out.println(num+"是素数");
            else
                System.out.println(num+"不是素数");
        }
    }
}