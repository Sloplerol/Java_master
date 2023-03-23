package Interger_pkg;

public class Interger03 {
    public static void main(String[] args) {
        //自动装箱 int->Interger
        Integer x = 100; //等同于Interger x = new Interger(100);
        //自动拆箱 Interger->int
        int y = x;
        //在进行计算的时候java会自动拆箱将x转换成基本数据类型
        System.out.println(x + 10);

        //java为了提高效率将字符范围内的包装对象提前存储在整数型常量池中
        Integer x1 = 100;
        Integer x2 = 100;
        System.out.println(x1 == x2); //true
        //当超出范围，才进行装箱操作
        Integer a1 = 200;
        Integer a2 = 200;
        System.out.println(a1 == a2); //false

    }
}
