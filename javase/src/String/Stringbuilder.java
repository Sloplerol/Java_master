package String;

public class Stringbuilder {
    public static void main(String[] args) {
        //非线程安全
        StringBuffer s = new StringBuffer();
        s.append(1);
        s.append('c');
        System.out.println(s);
    }
}
