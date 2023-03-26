package ThreadTest;

public class SleepTest01 {
    public static void main(String[] args) {
        /*System.out.println("程序开始执行");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("程序执行结束");*/
        for(int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
