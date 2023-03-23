package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {
    public static void main(String[] args) {
        //100 / 0算术异常 属于是运行时异常

        try{
            m1();
        }catch (FileNotFoundException f){
            //f保存的内存地址是new异常对象那个内存地址
            System.out.println("出错了，没有找到文件");
        }
        //如下的代码如果抛出异常是可以执行的
        System.out.println("dsfdsf");
    }

    private static void m1() throws FileNotFoundException{
        System.out.println("m1");
        m2();
    }

    private static void m2() throws FileNotFoundException{
        System.out.println("m2");
        //如果调用m3出现异常m2 end是不会执行的
        m3();
        System.out.println("m2 end");
    }
    //由于m2调用了m3方法所以也需要进行上报或者是自己单独捕获异常
    private static void m3() throws FileNotFoundException {
        System.out.println("m3");
        new FileInputStream("/Users/satrol_/Documents/组件通信进阶.md"); //出现FileNotFoundException异常需要对异常进行处理
    }
}
