/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 二分查找法
 */
public class Demo {
    public static void main(String[] args)
    {
        int arr[]={11,22,33,34,55,67,89};
        int x=binarySearch(arr,55);
        System.out.print("55在数组中出现的位置是"+(x+1));
    }

    private static int binarySearch(int[] arr,int i) {
        int min=0,max=arr.length,mid=(min+max)/2;
        while(min<=max)
        {
            if(arr[mid]<i)
            {
                min=mid+1;
            }
            else if(arr[mid]>i)
            {
                max=mid-1;
            }
            else
                return mid;
            mid=(min+max)/2;
        }
        return -1;
    }
}