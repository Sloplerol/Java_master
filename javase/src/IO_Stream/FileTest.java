package IO_Stream;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) throws IOException {
        ScreenLog("文件保存成功现在等待执行下一步操作");
        ScreenLog("操作错误请刷新重试");
        ScreenLog("操作过于频繁请稍后再试");

    }

    public static void ScreenLog(String msg){
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream("log.txt",true));
            System.setOut(ps);


            Date time = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            String timer = sdf.format(time);

            System.out.println(timer + "--->" + msg);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
