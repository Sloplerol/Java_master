package 异常;

public class Exception14 {
    public static void main(String[] args) {
        //父类抛出的异常必须比子类多

    }
}
//父类抛出异常一定要比子类大
class Animal{
    public static void doSome() throws Exception{

    }
}
class Human extends Animal{
    public static void doSome() throws NullPointerException{

    }
}
