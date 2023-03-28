package ThreadSafe;

public class 线程安全Account {
    private String setNo;
    private double balance;

    public 线程安全Account() {
    }

    public 线程安全Account(String setNo, double balance) {
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
        //线程同步机制 括号里面填写是共享的对象
        synchronized (this) {
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.setBalance(after);
        }

    }
}
