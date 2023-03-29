package homework;

public class ThreadHomework {
    public static void main(String[] args) {
        Object obj = new Object();
        Thread t1 = new Thread(new Printable(1,obj));
        Thread t2 = new Thread(new Printable(2,obj));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}


class Printable implements Runnable{
    private int value;
    private Object lock;

    public Printable(int value, Object lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public void run() {
        //上锁
        synchronized (lock){
            for(int i = value;i<=10;i+=2){
                //线程一抢到锁打印1
                System.out.println(Thread.currentThread().getName() + "----->" + i);
                //唤醒线程2
                lock.notify();
                try {
                    //当前线程进行等待
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            //唤醒另一个线程
            lock.notify();

        }
    }
}





