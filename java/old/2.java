/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 获取一个数组中的最值？？？
 */
public class Demo {
    public static void main(String[] args)
    {
        int arr[]={11,22,33,23,54,34};
        for(int i=0;i<5;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(arr[5]);
    }
}