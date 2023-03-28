package ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class threadTest02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask ft = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("callable begin");
                Thread.sleep(1000 * 5);
                System.out.println("callable end");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });
        Thread t = new Thread(ft);

        t.setName("t");
        t.start();

        //获取callable返回的结果
        Object obj = ft.get();
        //ft.get()存在线程阻塞问题 因为实现匿名内部类需要时间
        System.out.println(obj);
        System.out.println("线程执行结束");

    }
}
