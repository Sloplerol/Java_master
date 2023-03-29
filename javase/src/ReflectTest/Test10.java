package ReflectTest;

import java.io.File;
import java.lang.reflect.Field;

public class Test10 {
    public static void main(String[] args) throws Exception{
        //通过对象引用的方式进行获取
        Coder coder = new Coder();
        coder.name = "Lix";
        System.out.println(coder.name);


        //通过反射机制来获取属性
        Class c = Class.forName("ReflectTest.Coder");
        Object obj = c.newInstance();
        //获取obj属性
        Field field = c.getDeclaredField("age");
        //设置属性值 将obj的age属性赋值为222
        field.set(obj,222);
        //获取属性的值
        System.out.println(field.get(obj));

        //无法访问私有变量
        Field field1 = c.getDeclaredField("sex");
        //这种方式可以打破封装 可以访问到私有变量
        field1.setAccessible(true);

        field1.set(obj,"Millian");
        System.out.println(field1.get(obj));

    }
}



class Coder{
    public String name;
    protected int age;
    private String sex;
    double WorkTimer;
}
