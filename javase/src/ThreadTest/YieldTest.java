package ThreadTest;

public class YieldTest {
    public static void main(String[] args) {
        Thread t = new Thread();

        Thread thread = new Thread(new Other());
        thread.setName("fuxiancheng");
        thread.start();
        for(int i  = 1;i<=1000;i++){
            System.out.println(Thread.currentThread().getName() + "----->" + i);
        }
    }
}


class Other implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=1000;i++){
            if(i % 100 == 0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + "----->" + i);
        }
    }
}
