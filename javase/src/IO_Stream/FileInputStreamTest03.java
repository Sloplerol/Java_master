package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("hello.txt");
            byte[] arr = new byte[3];
            int ReadNum = 0;
            //fis.read(字节数组)返回的值是读取到字节到数量
            while((ReadNum = fis.read(arr)) != -1){
                System.out.println(ReadNum);
                //它会将字符所有进行转换，我们需要到是读到哪转化到哪
                System.out.println(new String(arr,0,ReadNum));
            }

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
        }

    }
}
