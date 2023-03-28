package ThreadTest;

public class setDemonTest01 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("t1");
        //开启守护线程 当用户线程结束整个程序就结束了
        t1.setDaemon(true);
        t1.start();
        for(int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "----->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class MyThread extends Thread{
    @Override
    public void run() {
        int i =  0;
        for(;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("副线程" + ++i);
        }
    }
}
