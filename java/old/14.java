/**
 * Created by jinxiaobo on 17/2/2.
 * 编程题：
 "34 9 -7 12 67 25"要求对这个字符串中的数值进行从小到大的排序
 */
import java.util.Arrays;

public class Demo {
    private static final String SPACE = " ";
    public static void main(String[] args) {
        String str = "34 9 -7 12 67 25";
        str = sortStringNumber(str);
        System.out.println(str);
    }

    private static String sortStringNumber(String str) {
        String[] strarr=str.split(SPACE);
        int[] numarr=stringtoint(strarr);
        sortint(numarr);
        String finalstr=inttostring(numarr);
        return finalstr;
    }

    private static String inttostring(int[] numarr) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numarr.length;i++)
        {
            if(i==numarr.length-1)
                sb.append(numarr[i]);
            else
                sb.append(numarr[i]+" ");

        }
        return sb.toString();
    }

    private static void sortint(int[] numarr) {
        Arrays.sort(numarr);
    }

    private static int[] stringtoint(String[] strarr) {
        int [] nums=new int[strarr.length];
        for(int i=0;i<strarr.length;i++)
        {
            nums[i]=Integer.parseInt(strarr[i]);
        }
        return nums;
    }
}