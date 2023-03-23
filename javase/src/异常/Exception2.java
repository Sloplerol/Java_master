package 异常;

public class Exception2 {
    public static void main(String[] args) {
        //程序创建了一个ArithmeticException异常对象，将该异常抛给调用者mian，main没有进行处理所有抛给了JVM虚拟机直接终止程序的进行
        System.out.println(10 / 0);
        System.out.println("hello world");
    }
}
