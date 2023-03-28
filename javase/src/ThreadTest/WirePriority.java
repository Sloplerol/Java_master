package ThreadTest;

public class WirePriority {
    public static void main(String[] args) {
        System.out.println("最高优先级"+Thread.MAX_PRIORITY);
        System.out.println("最低优先级"+Thread.MIN_PRIORITY);
        System.out.println("当前线程低的优先级" + Thread.NORM_PRIORITY);
        Thread t = Thread.currentThread();
        //设置线程
        t.setPriority(3);
        System.out.println(t.getName() + "线程的优先级是" + t.getPriority());


        Thread thread = new Thread(new MyRunnable());
        thread.setPriority(10);
        thread.setName("t");
        thread.start();

        //线程优先级越高，抢占的时间片更多
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + "------>" + i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程的优先级是" + Thread.currentThread().getPriority());
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + "------>" + i);
        }
    }
}
