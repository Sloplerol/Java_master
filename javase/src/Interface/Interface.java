package Interface;

public class Interface {
    public static void main(String[] args) {
        //接口里的变量就是常量
//        A.a = 20;
    }
}
interface A{
    int a = 10;
}

interface B extends A{

}

interface C extends A,B{
    int add(int a,int b);
}

abstract class MyOrder implements B{
    //implement和extends类似都会继承抽象方法所以需要重写或者是定义抽象类
}