package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //读取文件的相对路径是IJ_java下
            fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(fis != null){
                try {
                    fis.read();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
