package ThreadTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest01 {
    public static void main(String[] args) throws ParseException {
        //创建一个定时器对象
        Timer timer = new Timer();
        //守护线程的定时器
        //Timer timer1 = new Timer(true);

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        //设置起始执行时间
        Date firstTime = sdf.parse("2023-03-28 08:40:00");
        //每隔多少时间执行一次
        timer.schedule(new Task(),firstTime,1000 * 5);
    }
}

class Task extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String afterTime =sdf.format(new Date());
        System.out.println(afterTime + "完成了一次数据备份 ");

    }
}

