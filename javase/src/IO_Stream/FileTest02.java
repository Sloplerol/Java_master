package IO_Stream;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        File f = new File("/Users/satrol_/Java");
        //listFiles列举目录下所有的文件
        File[] files = f.listFiles();
        for(File file : files){
            System.out.println(file);
        }
    }
}
