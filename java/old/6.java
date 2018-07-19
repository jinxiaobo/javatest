/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 对数组中的元素进行反转
 */
public class Demo {
    public static void main(String[] args)
    {
        int arr[]={11,22,33,55,23,54,34};
        SwapArr(arr);
        print(arr);
    }

    private static void SwapArr(int[] arr) {
        for(int i=0,j=arr.length-1;j>=i;i++,j--)
        {
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
