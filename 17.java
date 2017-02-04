/**
 * Created by jinxiaobo on 17/2/4.
 * 编程题：
 获取键盘录入，并把录入字符转换成大写输出出来
 */
import java.io.*;

public class Demo{
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String line=null;
        while((line=br.readLine())!=null)
        {
            if(line.equals("over"))
                break;
            bw.write(line.toUpperCase());
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}