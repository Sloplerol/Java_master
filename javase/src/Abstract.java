public class Abstract {
    public static void main(String[] args) {
        //面向抽象编程
        credit c = new xinyongcredit();

        c.hello();
    }
}


abstract class credit{
    public abstract void hello();
}

class xinyongcredit extends credit{
    public void hello(){
        //通过覆盖的方式对抽象方法进行重写
        System.out.println("hello");
    }
}
