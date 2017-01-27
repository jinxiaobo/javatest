/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 对二维数组进行求和
 */
public class Demo {
    public static void main(String[] args)
    {
        int[][] arr={{11,22,33},{44,55,66}};
        int x=GetSum(arr);
        System.out.println(x);
    }

    private static int GetSum(int[][] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
            {
                sum=sum+arr[i][j];
            }
        return sum;
    }
}