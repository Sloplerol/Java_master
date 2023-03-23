package Interger_pkg;

public class Interger01 {
    public static void main(String[] args) {
        //八种包装类属于引用数据类型 char和boolean父类都是Object，其余的都是Number

        //基本数据类型转换成包装类型 装箱
        Integer a = new Integer(123);

        //将包装类型转化成基本数据类型 拆箱
        float f = a.floatValue();

        System.out.println(f);
    }
}
