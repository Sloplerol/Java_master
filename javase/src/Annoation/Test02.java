package Annoation;

public class Test02 {
    public static void main(String[] args) {

    }
    //当注解里面有value属性可以省略属性名不写
    @MyAnnoation1("hello")
    public void m1(){
        System.out.println("hello world");
    }
}


