package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws Exception {
        //获取系统当前时间
        Date d = new Date();
        System.out.println(d);

        //格式化时间
        //年月日时分秒毫秒格式不能修改，其余都行
        SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SS");
        String adate = formatTime.format(d);
        System.out.println(adate);

        //如何将格式化的时间转化回去
        String time = "2023-03-19 12:12:56 668";
        Date day = formatTime.parse(time);
        System.out.println(day);


    }
}
