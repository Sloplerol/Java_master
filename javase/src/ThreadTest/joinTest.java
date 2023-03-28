package ThreadTest;

public class joinTest {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThreadTest());
        t.setName("thread");
        t.start();

        try {
            //合并线程，当前线程受阻，等执行完该线程main线程继续执行
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end of file");
    }
}

class MyThreadTest implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}
