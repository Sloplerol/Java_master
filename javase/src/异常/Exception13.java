package 异常;

public class Exception13 {
    public static void main(String[] args) {
        MyException m = new MyException("编译出现错误");
        m.getMessage();
        m.printStackTrace();
    }
}
