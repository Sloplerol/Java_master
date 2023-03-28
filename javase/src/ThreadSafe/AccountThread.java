package ThreadSafe;

public class AccountThread extends Thread{
    //多线程共享一个账户对象
    private Account account;

    public AccountThread() {
    }

    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.takeMoney(1000);
        System.out.println("账户为"+account.getSetNo()+"取款成功，余额为" + account.getBalance());
    }
}
