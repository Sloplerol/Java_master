package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception5 {
    public static void main(String[] args) {
        m1();
    }

    private static void m1(){
        m2();
    }

    private static void m2(){
        m3();
    }

    private static void m3(){
        //当捕获多个异常当时候必须从小到大进行捕捉
        try{
            new FileInputStream("/user/sdf");
        }/*catch (FileNotFoundException e){
            System.out.println("未读取到文件");
        }catch (Exception e){
            System.out.println("读取文件出错");
        }*/
        //JDK8支持多异常写一起 异常关系是同级的
        catch (FileNotFoundException | NullPointerException e){
            System.out.println("未成功读取到文件");
        }
    }
}
