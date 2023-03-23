package 异常;

public class Exception3 {
    //1.抛给上一级
    public static void main(String[] args) /*throws ClassNotFoundException*/{
        //两种解决这种异常的方式
        //通过trycatch来捕获异常
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    //ClassNotFoundException最上级属于Exception编译时异常，需要对程序进行预处理
    public static void doSome() throws ClassNotFoundException{
        System.out.println("hello");
    }
}

