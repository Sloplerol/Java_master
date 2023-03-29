package ReflectTest;

public class Test01 {
    public static void main(String[] args) {
        Class c3 = null;
        try {
            //Class.forName() 获取包类型
            Class c1 = Class.forName("java.lang.Object");
            Class c2 = Class.forName("java.lang.reflect.Constructor");
            c3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String s = "abc";
        //通过getClass可以获取字节码文件 X类型也是字符串类型
        Class X = s.getClass();
        System.out.println(X == c3);

        //通过字节码文件来获取Class
        Class a = String.class;
        Class b = Double.class;



    }

    public Test01() {
        System.out.println("hello");
    }
}
