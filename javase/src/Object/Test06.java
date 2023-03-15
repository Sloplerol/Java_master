package Object;

public class Test06 {
    public static void main(String[] args) {
        Throw t = new Throw();
        t = null;
        //建议垃圾回收器启动,可能启动，也可能不启动
        System.gc();

    }

}

class Throw{
    //过时了
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}