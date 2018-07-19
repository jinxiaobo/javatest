/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 使用选择排序法对数组进行排序
 */
public class Demo {
    public static void main(String[] args)
    {
        int arr[]={11,22,33,23,54,34};
        SelectSort(arr);
        print(arr);
    }
    public static void SelectSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                    swap(arr,i,j);
            }
    }
    public static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println(arr[arr.length-1]);
    }
}
