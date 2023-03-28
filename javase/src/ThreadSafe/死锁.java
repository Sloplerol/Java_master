package ThreadSafe;

public class 死锁 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Thread t1 = new Obj1(obj1,obj2);
        Thread t2 = new Obj2(obj1,obj2);
        t1.start();
        t2.start();

    }
}


class Obj1 extends Thread{
    Object object1;
    Object object2;

    public Obj1(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized (object1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (object2){

            }
        }
    }
}

class Obj2 extends Thread{
    Object object1;
    Object object2;

    public Obj2(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized (object2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (object1){

            }
        }
    }
}
