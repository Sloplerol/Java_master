package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创建文件输入流对象
            fis = new FileInputStream("/Users/satrol_/Desktop/hello.txt");
            int fileData = 0;
            while((fileData = fis.read()) != -1){
                //当数据读取完毕之后读取到到数据是-1
                System.out.println(fileData);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fis != null){
                //如果流是不是空的话才进行关闭
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
