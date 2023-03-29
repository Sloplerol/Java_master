package ReflectTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileReader fr = new FileReader("javase/src/ReflectTest/className.properties");
        Properties pro = new Properties();
        pro.load(fr);
        fr.close();
        String Username = pro.getProperty("Username");
        System.out.println(Username);

        Class c = Class.forName(Username);
        Object obj = c.getNestHost();
        System.out.println(obj);
    }
}
