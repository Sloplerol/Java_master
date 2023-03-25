package IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogClass {
    public static void LogMsg(String msg){
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("log.txt",true));
            System.setOut(ps);

            Date nowdate = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
            String strTime = sdf.format(nowdate);

            System.out.println(strTime + ":" + msg);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
