package Interger_pkg;

public class Interger05 {
    public static void main(String[] args) {
        //int->String
        String a1 = 123 + "";
        String a = String.valueOf(1);
        //String->int
        int b = Integer.parseInt("123");

        //String->Integer
        Integer s = Integer.valueOf("abc");
        //Integer->String
        String s1 = String.valueOf(s);

        //int->Integer
        Integer x = 100;
        //Integer->int
        int x1 = x.intValue();

    }
}
