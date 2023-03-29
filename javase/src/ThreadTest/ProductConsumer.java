package ThreadTest;

import java.util.ArrayList;
import java.util.List;

public class ProductConsumer {
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread t1 = new Thread(new Product(list));
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}


class Product implements Runnable{
    private List list;

    public Product(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            synchronized (list){
                if(list.size() > 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            Object obj = new Object();
            list.add(obj);
            System.out.println(Thread.currentThread().getName() + "----->" + obj);
            list.notifyAll();
        }
    }
}


class Consumer implements Runnable {
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            synchronized (list){
                if(list.size() == 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "----->" + obj);
                obj.notifyAll();
            }
        }


    }
}