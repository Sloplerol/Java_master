package ReflectTest;

public class Test02 {
    public static void main(String[] args) {
        try {
            //获取class
            Class c1 = Class.forName("ReflectTest.Test01");
            //通过class来实例化对象
            Object obj = c1.newInstance();
            //newInstance会调用Test01类的无参数构造方法
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
