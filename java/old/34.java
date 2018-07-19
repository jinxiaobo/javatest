/**
 * Created by jinxiaobo on 17/3/2.
 * Write a function that takes a string as input and returns the string reversed.
 */

public class Demo{
    public static void main(String args[])
    {
        String s="hello";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length/2;i++)
        {
            char temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        return String.valueOf(arr);
    }
}

