package ThreadTest;

public class StopWireTest02 {
    public static void main(String[] args) {
        Geogry g = new Geogry();
        Thread thread = new Thread(g);
        thread.setName("hello");
        thread.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        g.flag = false;
    }
}


class Geogry implements Runnable{
    boolean flag = true;
    @Override
    public void run() {
            for(int i = 0;i<10;i++){
                if(flag){
                    System.out.println("i----->" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    return;
                }
            }

    }
}
