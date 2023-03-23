package 异常;

public class Exception1 {
    public static void main(String[] args) {
        //通过异常类来创建异常实例化对象
        NumberFormatException nfe = new NumberFormatException("出错了");
        System.out.println(nfe);
    }
}
