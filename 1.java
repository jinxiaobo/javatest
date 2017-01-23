package IO流3;
/**
 * Created by jinxiaobo on 17/1/23.
 * 编程题：
 定义一个功能，完成对考试成绩的等级划分。
 90~100 A 优秀
 80~89 B 良好
 70~79 C 中等
 60~69 D 及格
 60以下 E 不及格
 */
public class Demo {
    public static void main(String[] args)
    {
        char level=GetLevel(78);
        System.out.println(level);
    }
    public static char GetLevel(int num)
    {
        char ch;
        if(num<=100&&num>=90)
            ch='A';
        else if(num<=89&&num>=80)
            ch='B';
        else if(num<=79&&num>=70)
            ch='C';
        else if(num<=69&&num>=60)
            ch='D';
        else
            ch='E';
        return ch;
    }
}
