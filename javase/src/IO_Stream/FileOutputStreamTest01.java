package IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //这种方式会将文件清空并重新写入
            //fos = new FileOutputStream("hello.txt");
            //这种方式是在原文件后面追加
            fos = new FileOutputStream("hello.txt",true);
            byte[] bytes = {97,98,99};
            fos.write(bytes);
            fos.write(bytes,0,2);

            String str = "我是你大爷";
            byte[] bs = str.getBytes();
            fos.write(bs);

            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
