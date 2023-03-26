package ThreadTest;

public class ImplementRunable {
    public static void main(String[] args) {
        Wireless wl = new Wireless();
        //将这个类转化为线程对象
        Thread t = new Thread(wl);
        t.start();
        for(int i = 0;i<100;i++){
            System.out.println("主线程是"+i);
        }
    }
}

//创建一个可运行的类
class Wireless implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println("父线程是"+i);
        }
    }
}
