package ThreadTest;

public class StopWireTest01 {
    public static void main(String[] args) {
        Thread t = new Thread(new Wire());
        t.setName("thread");
        t.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.stop();
    }
}

class Wire implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println("i--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
