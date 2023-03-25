package IO_Stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            //创建文件输出流字符对象
            fw = new FileWriter("newfile.txt",true);

            char[] chars = {'你','找','死','吗','?'};
            //fw.write(chars);
            fw.write(chars,2,3);

            fw.write("hello world");
            fw.write("\n");
            fw.write("hello world1");

            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
