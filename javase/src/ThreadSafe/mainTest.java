package ThreadSafe;

public class mainTest {
    public static void main(String[] args) {
        Account ac = new Account("zjj",2000);
        Thread t1 = new AccountThread(ac);
        Thread t2 = new AccountThread(ac);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
