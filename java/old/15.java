/**
 * Created by jinxiaobo on 17/2/3.
 * 编程题：
 把一个文档中的内容拷贝到另一个文档中去
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("lib/info.txt");
        FileWriter fw=new FileWriter("lib/copy_info.txt");
        int len=0;
        while((len=fr.read())!=-1)
            fw.write(len);
        fr.close();
        fw.close();
    }
}