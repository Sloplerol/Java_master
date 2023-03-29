package ReflectTest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test08 {
    public static void main(String[] args) {
        try {
            //获取Student类
            Class student = Class.forName("ReflectTest.Student");
            //获取这个类的完整类名
            System.out.println(student.getName());
            //获取类的简类名
            System.out.println(student.getSimpleName());

            //获取类里的所有public属性
            Field[] fields = student.getFields();
            System.out.println(fields.length); //1
            //获取类里面的所有属性
            Field[] fields1 = student.getDeclaredFields();
            System.out.println(fields1.length); //4

            for(Field field : fields1){
                //获取修饰符
                int i = field.getModifiers();
                System.out.println(i); //获取到的是每一个修饰符的代号
                //通过toString方法进行转化
                System.out.println(Modifier.toString(i));



                //获取所有属性的名字
                System.out.println(field.getName());
                //获取类型
                Class classType = field.getType();
                System.out.println(classType.getName());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}


class Student{
    private int id;
    protected String name;
    public int password;
    double weight;
}
