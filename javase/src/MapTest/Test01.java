package MapTest;

import java.util.HashSet;
import java.util.Set;

public class Test01 {
    //定义一个静态内部类
    private static class staticInnerClass{
        public static void m1(){
            System.out.println("hello m1");
        }

        public void m2(){
            System.out.println("hello m2");
        }
    }

    public static void main(String[] args) {
        staticInnerClass sic = new staticInnerClass();
        sic.m2();
        staticInnerClass.m1();
        //Set集合内存储的对象的类型是Test01.staticInnerClass
        Set<Test01.staticInnerClass> si = new HashSet<>();

    }
}
