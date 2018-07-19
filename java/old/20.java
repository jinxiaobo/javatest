/**
 * Created by jinxiaobo on 17/2/6.
 * 编程题：
 删除一个带内容的文件夹
 */
import java.io.File;

public class Demo{
    public static void main(String args[])
    {
        File dir=new File("lib/test");
        remove(dir);
    }
    private static void remove(File dir)
    {
        File[] files=dir.listFiles();
        for(File file:files)
        {
            if(file.isDirectory())
                remove(file);
            else
                System.out.println(file+":"+file.delete());
        }
        System.out.println(dir+":"+dir.delete());
    }
}