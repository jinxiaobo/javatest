/**
 * Created by jinxiaobo on 17/2/4.
 * 编程题：
 使用字节流拷贝一个MP3文件
 */
import java.io.*;

public class Demo{
    public static void main(String args[]) throws IOException {
        FileInputStream fis=new FileInputStream("lib/0.mp3");
        FileOutputStream fos=new FileOutputStream("lib/1.mp3");
        byte[] ch=new byte[1024*8];
        int len=0;
        while((len=fis.read(ch))!=-1)
        {
            fos.write(ch,0,len);
        }
        fis.close();
        fos.close();
    }
}