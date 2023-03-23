package Interger_pkg;

public class Interger04 {
    public static void main(String[] args) {
        //将字符串转化成int类型
        int a = Integer.parseInt("123");
        System.out.println(a + 100);
        //如果传入的不是一个字符串数字的话 会报NumberFormatException错
        //int b = Integer.parseInt("你好啊");
        //System.out.println(b);

        double h = Double.parseDouble("1.23");
        System.out.println(h);

        float h1 = Float.parseFloat("1.2");
        System.out.println(h1);

        //以上这些字符串转化类型都是通过类名来调用的属于静态方法
    }
}
