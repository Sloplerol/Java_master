package ReflectTest;

import java.lang.reflect.Constructor;

public class Test12 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("ReflectTest.ConstructorClass");
        //调用无参数构造
        Object obj = c.newInstance();
        //获取有参数构造
        Constructor constructor = c.getConstructor(String.class,int.class,double.class);
        //调用有参数构造
        Object newObject = constructor.newInstance("abb",23,23.32);
        System.out.println(newObject);
    }
}


class ConstructorClass{
    public String name;
    public int age;
    public double price;

    public ConstructorClass() {
    }

    public ConstructorClass(int age) {
        this.age = age;
    }

    public ConstructorClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ConstructorClass(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }
}
