import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lei lei = new Lei("zjj");
        Thread t1 = new Wire1(lei);
        Thread t2 = new Wire1(lei);

        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();


    }
}

class Wire1 extends Thread{
    private Lei lei;

    public Wire1() {
    }

    public Wire1(Lei lei){
        this.lei = lei;
    }



    @Override
    public void run() {

    }
}

class Lei{
    private String name;

    private int money;

    public Lei() {
    }

    public Lei(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeMoney(int money){
        int before = this.money;
        int after = before - money;
        this.money = after;
    }


}




