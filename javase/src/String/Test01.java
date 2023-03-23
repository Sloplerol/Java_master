package String;

public class Test01 {
    public static void main(String[] args) {
        //在堆内存中开辟一段空间里面包含age还有一个指向常量池里字符串的地址
        Student s = new Student("zjj",123);

        String x1 = "abc";
        String x2 = "abc";
        //因为都在公用字符常量池里的一个字符串，地址也相同
        System.out.println(x1 == x2); //true

        String a1 = new String("abc");
        String a2 = new String("abc");
        //因为a1，a2都是new出来的，堆内存两块空间里面保存的指向字符常量池地址是一样的
        System.out.println(a1 == a2); //false
        System.out.println(a1.equals(a2)); //true String类已经重写了equals方法

        String k = new String("hello");
        //由于字符串属于是字符串对象所以是可以写成这种形式的
        System.out.println("hello".equals(k));

        //面试题
        String b1 = new String("abc");
        String b2 = new String("abc");
        //一共三个对象 堆内存里俩 常量存储池里一个

    }
}
