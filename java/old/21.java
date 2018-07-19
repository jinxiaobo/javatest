/**
 * Created by jinxiaobo on 17/2/7.
 * 编程题：
 将一个段文字数据写入到硬盘上.
 */

import java.io.FileWriter;
import java.io.IOException;

public class Demo{
    public static void main(String args[]) throws IOException {
        FileWriter fw=new FileWriter("lib/data.txt");
        fw.write("你好!");
        fw.flush();
        fw.close();
    }
}
