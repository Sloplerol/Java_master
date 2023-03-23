package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        //如果Date内有参数返回的是1970年的时间 + 传入毫秒数自动转化后的数字
        Date date = new Date(1);  //参数代表毫秒数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-dd HH:mm:ss SS");
        String time = sdf.format(date);
        System.out.println(time);

        //获取一天前的时间
        Date date1 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        System.out.println(date1);


    }
}
