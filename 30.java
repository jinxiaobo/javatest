/**
 * Created by jinxiaobo on 17/2/18.
 * 编写程序，将一个数组中的元素倒排过来。例如原数组为1，2，3，4，5；则倒排后数组中的值
   为5，4，3，2，1。
 */

public class Demo{
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i]+",");
        }
    }
}