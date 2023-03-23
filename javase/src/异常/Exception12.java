package 异常;

//final finally finalize区别

//final修饰不能被继承
//final修饰不能被覆盖
//final修饰的变量不能二次赋值


//finally和try是联合使用的
//finally内的代码是一定会执行的

//finalize是Object类中的方法，用来JVM垃圾回收

public class Exception12 {
    public static void main(String[] args) {

        final int a = 20;
    }
}
