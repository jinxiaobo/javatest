/**For a web developer, it is very important to know how to design a web page's size. So, 
given a specific rectangular web page’s area, your job by now is to design a rectangular web page, 
whose length L and width W satisfy the following requirements:
 **/

public class Demo{
    public static void main(String args[])
    {
        int num=18;
        int arr[]=constructRectangle(num);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    public static int[] constructRectangle(int area) {
        int[] arr=new int[2];
        int a=(int)Math.sqrt(area);
        while(area%a!=0)
            a--;
        arr[0]=area/a;
        arr[1]=a;
        return arr;
    }
}

