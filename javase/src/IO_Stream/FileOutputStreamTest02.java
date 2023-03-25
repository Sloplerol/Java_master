package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("/Users/satrol_/html5/BIzzard_index/mp4/WoWx9_Shadowlands_Intro.mp4");
            //文件拷贝
            fos = new FileOutputStream("hello.txt");
            byte[] bytes = new byte[1024 * 1024];
            int ReadCount = 0;
            while((ReadCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,ReadCount);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
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
