package 异常;

public class Exception10 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            //退出JVM虚拟机finally里的代码执行不到
            System.exit(0);
        }finally {
            System.out.println("finally");
        }
    }
}
