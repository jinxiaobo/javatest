/**
 * Created by jinxiaobo on 17/2/5.
 * 编程题：
 定义一个功能用于记录住软件运行的次数，如果运行次数大于5次。
 */
import java.io.*;
import java.util.Properties;

public class Demo{
    public static void main(String args[]) throws IOException{
        GetCount();
    }
    private static void GetCount() throws IOException{
        File confile = new File("lib/count.properties");
        Properties prop = new Properties();
        if (!confile.exists()) {
            confile.createNewFile();
        }
        FileInputStream fis = new FileInputStream(confile);
        prop.load(fis);
        String value = prop.getProperty("time");
        int count = 0;
        if (value != null) {
            count = Integer.parseInt(value);
            System.out.println("使用次数:"+count);
            if (count >= 5) {
                throw new RuntimeException("使用已达5次");
            }
        }
        count++;
        prop.setProperty("time", Integer.toString(count));
        FileOutputStream fos = new FileOutputStream(confile);
        prop.store(fos, "");
        fis.close();
        fos.close();
    }
    }
