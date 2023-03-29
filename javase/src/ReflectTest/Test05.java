package ReflectTest;

public class Test05 {
    public static void main(String[] args) {
        //currentThread获取当前线程对象
        //getContextClassLoader获取当前线程对象的类加载器
        //getResource从类的根路径src下加载资源
        //通过该代码可以拿到文件的绝对路径 前提是在src下指定文件目录
        String path = Thread.currentThread().getContextClassLoader().getResource("ReflectTest/className.properties").getPath();
        System.out.println(path);
    }
}
