/**
 * Created by jinxiaobo on 17/2/6.
 * 编程题：
 获取指定目录中的目录
 */
import java.io.File;

public class Demo{
    public static void main(String args[]) 
    {
        File dir=new File("lib");
        File[] files=dir.listFiles();
        for(File file:files)
            System.out.println(file);
    }
}