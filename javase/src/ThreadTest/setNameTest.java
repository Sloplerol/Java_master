package ThreadTest;

public class setNameTest {
    public static void main(String[] args) {
        //这里new的是一个没有名字单类
        Thread t = new Thread(new Runnable(){
            public void run(){
                //通过匿名内部类来实现
                for(int i = 0;i<100;i++){
                    System.out.println("副线程----->" + i);
                }
            }
        });

        t.start();
        for(int j = 0;j<100;j++){
            System.out.println("主线程--->" + j);
        }
    }
}
