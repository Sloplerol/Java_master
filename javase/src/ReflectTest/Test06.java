package ReflectTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test06 {
    public static void main(String[] args) throws Exception{
            //相当于是new了一个路径传入流
//        String path = Thread.currentThread().getContextClassLoader().getResource("ReflectTest/className.properties").getPath();
            //直接以流的形式返回
            InputStream fr = Thread.currentThread().getContextClassLoader().getResourceAsStream("ReflectTest/className.properties");
            Properties pro = new Properties();
            pro.load(fr);
            fr.close();
            //通过key来获取value的值
            Object obj = pro.getProperty("Username");
            System.out.println(obj);
    }

}
