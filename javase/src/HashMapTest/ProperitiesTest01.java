package HashMapTest;

import java.util.Properties;

public class ProperitiesTest01 {
    public static void main(String[] args) {
        //创建Properities对象
        Properties pro = new Properties();
        pro.setProperty("1","hello");
        pro.setProperty("2","hello");
        pro.setProperty("3","hello");
        //通过key来获取value
        String s1 = pro.getProperty("1");
        String s2 = pro.getProperty("2");
        String s3 = pro.getProperty("3");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
