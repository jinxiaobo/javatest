/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 数组中查表法的应用--通过用户的指定星期数字，返回给用户对应的星期中文或者英文.
 */
public class Demo {
    public static void main(String[] args)
    {
        String week=SearchWeek(7);
        System.out.print("week:"+week);
    }

    private static String SearchWeek(int i)
    {
        if(i>7||i<0)
            return "没有对应星期";
        String arr[]={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        return arr[i-1];
    }
}
