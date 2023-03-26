package ThreadTest;

public class extendThread {
    public static void main(String[] args) {
        //创建线程对象
        School school = new School();
        //启动线程 开辟一个栈空间
        //school.start();
        school.run();
        for(int i = 0;i<1000;i++){
            System.out.println("主线程---->" + i);
        }
    }
}

//实现线程的方法
    //- 通过编写一个类继承Thread，重写run方法

class School extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<1000;i++){
            System.out.println("分支线程"+i);
        }
    }
}
