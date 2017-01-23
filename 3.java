/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 对一个数组进行遍历
 */
public class Demo {
    public static void main(String[] args)
    {
        int arr[]={11,22,33,23,54,34};
        for(int i=0;i<arr.length-1;i++)
        {
           System.out.print(arr[i]+",");
        }
        System.out.println(arr[5]);
    }
}