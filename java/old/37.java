/**
 * Created by jinxiaobo on 17/3/8.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */

public class Demo{
    public static void main(String args[])
    {
        int[] array={1,1,2,2,3,3,4};
        System.out.println(singleNumber(array));
    }
    private static int singleNumber(int[] array) {
        int num=array[0];
        for(int i=1;i<array.length;i++){
            num=num^array[i];
        }
        return num;
    }
}