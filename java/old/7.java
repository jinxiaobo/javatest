/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 找一个数组中查找一个元素的第一次出现的位置
 */
public class Demo {
    public static void main(String[] args)
    {
        int arr[]={11,22,33,55,23,54,34};
        int x=Search(arr,33);
        System.out.print("33在数组中出现的位置是"+(x+1));
    }

    private static int Search(int[] arr,int i) {
        for(int j=0;j<arr.length;j++)
        {
            if(i==arr[j])
                return j;
        }
        return -1;
    }
}