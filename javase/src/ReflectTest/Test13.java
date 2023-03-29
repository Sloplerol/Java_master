package ReflectTest;

public class Test13 {
    public static void main(String[] args) throws Exception {
        Class stringclass = Class.forName("java.lang.String");
        //通过getSuperClass获取父类
        System.out.println(stringclass.getSuperclass().getSimpleName());

        //获取所有的String实现的接口
        Class[] Interface = stringclass.getInterfaces();
        for(Class in : Interface){
            System.out.println(in.getName());
        }
    }
}
