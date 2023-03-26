package ThreadTest;

public class SleepTest02 {
    public static void main(String[] args) {
        Thread t = new Thread(new Hello());
        t.setName("thr");
        t.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //通过java的异常处理机制中断t的睡眠
        t.interrupt();


    }
}

class Hello implements Runnable{
    @Override
    //子类不能比父类run 抛出更多的异常
    //所以这里只能trycatch
    public void run() {
        System.out.println(Thread.currentThread().getName() + "----> begin");
        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "----> end");

    }
}
