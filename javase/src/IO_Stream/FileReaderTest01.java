package IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("m1.txt");
//            char[] chars = new char[4];
//            int charsCount = 0;
//            while((charsCount = fr.read(chars)) != -1){
//                System.out.print(new String(chars,0,charsCount));
//            }

            char[] chars1 = new char[4];
            //往chars1数组里面读
            fr.read(chars1);
            for(char c : chars1){
                //读取字符是一个一个字符进行读的
                System.out.println(c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
