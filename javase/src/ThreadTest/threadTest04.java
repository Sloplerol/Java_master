package ThreadTest;

public class threadTest04 {
    public static void main(String[] args) {
        Daben daben = new Daben();
        //默认状态下线程的名字是Thread-0
        daben.setName("sdfsdf");
        String name1 = daben.getName();
        System.out.println(name1);

        Daben daben1 = new Daben();
        String name2 = daben1.getName();
        System.out.println(name2);
        daben.start();

    }
}
class Daben extends Thread{
    @Override
    public void run() {
        super.run();
    }
}
