package ReflectTest;

public class Test04 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("ReflectTest.MyClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

class MyClass{
    //可以通过Class.forName只执行静态代码块中的内容
    static {
        System.out.println("这是静态代码块");
    }
}
