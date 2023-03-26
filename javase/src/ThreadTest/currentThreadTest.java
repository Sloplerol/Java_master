package ThreadTest;

public class currentThreadTest {
    public static void main(String[] args) {
        //获取当前线程的对象
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()); //main

        NiHao nihao = new NiHao();
        nihao.setName("hello");
        nihao.start();
    }
}

class NiHao extends Thread{
    public void doSome(){
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {

        for(int i = 0;i<10;i++){
            //哪一个线程对象调用他就谁
            Thread currentThread1 = Thread.currentThread();
            System.out.println(currentThread1.getName());
        }
    }
}
