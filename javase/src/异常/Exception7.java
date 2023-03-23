package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception7 {
    public static void main(String[] args) {
        try{
            s1();
        }catch (Exception e){
            e.printStackTrace();
        }
        //即使出现了异常但是程序正常执行，提高了程序的健壮性
        System.out.println("helloworld");
    }

    private static void s1() throws FileNotFoundException{
        s2();
    }

    private static void s2() throws FileNotFoundException{
        s3();
    }

    private static void s3() throws FileNotFoundException {
        new FileInputStream("user/hello.c");

    }
}
