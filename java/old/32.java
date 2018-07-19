/**
 * Created by jinxiaobo on 17/3/1.
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

 Given two integers x and y, calculate the Hamming distance.
 */

public class Demo{
    public static void main(String args[])
    {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y)
    {
        int z=x^y;
        int count=0;
        while(z!=0)
        {
            z=z&(z-1);
            count++;
        }
        return count;
    }
}

