package IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello");

        PrintStream ps = new PrintStream(System.out);
        ps.print("hello world");
        //标准输出指向log文件
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        //修改输出方向
        System.setOut(printStream);

        System.out.println("hello world");
        System.out.println("hello world1");
        System.out.println("hello world2");
    }
}
