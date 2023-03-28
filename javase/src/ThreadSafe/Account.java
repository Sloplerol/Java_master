package ThreadSafe;

public class Account {
    private String setNo;
    private double balance;

    public Account() {
    }

    public Account(String setNo, double balance) {
        this.setNo = setNo;
        this.balance = balance;
    }

    public String getSetNo() {
        return setNo;
    }

    public void setSetNo(String setNo) {
        this.setNo = setNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void takeMoney(double money){
        //发现synchronized会进入锁池查找共享对象，此时会释放掉所有掉CPU时间片，如果没找到就会在锁池内等待，如果找到了就会返回就绪状态抢夺时间片
        synchronized (this){
            //before
            double before = this.getBalance();
            //after
            double after = before - money;
            //更新
            //当第一个线程执行代码还没来得及更新当时候此时账户里当前还是原来的钱，此时若是有第二条线程来执行takeMoney方法就会出现问题
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.setBalance(after);
        }
    }
}
