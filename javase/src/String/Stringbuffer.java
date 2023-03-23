package String;

public class Stringbuffer {
    public static void main(String[] args) {
        //字符串拼接导致的问题 浪费方法区字符串常量池空间

        //Stringbuffer默认情况下定义了一个空间为16的byte数组
        StringBuffer s = new StringBuffer();
        //append拼接字符 如果字符空间不够用的话会自动扩容
        s.append(1);
        s.append("hello");
        s.append(true);
        s.append(100L);
        System.out.println(s);

        StringBuffer sm = new StringBuffer(1000);
        sm.append("sf");
        sm.append("sdf");
        sm.append("fd");
        System.out.println(sm);

    }
}
