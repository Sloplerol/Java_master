package 异常;

public class Exception6 {
    public static void main(String[] args) {
        //这里仅仅是new了一个异常对象但是并没有抛出
        NullPointerException e = new NullPointerException("空指针异常");
        //获取异常传入的字符串

        //通过异步线路打印异常堆栈信息
        e.printStackTrace();
        System.out.println("sdfsf");
    }
}
