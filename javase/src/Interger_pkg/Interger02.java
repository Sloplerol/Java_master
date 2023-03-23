package Interger_pkg;

public class Interger02 {
    public static void main(String[] args) {
        //将数据转化为Interger包装类型
        Integer i = new Integer(123);
        System.out.println(i);
        Integer i1 = new Integer("123");
        System.out.println(i1);
        //将数据转化成Double数字类型
        Double i2 = new Double("123");
        System.out.println(i2);
        Double i3 = new Double(123);
        System.out.println(i3);


        //获取最大值和最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}
