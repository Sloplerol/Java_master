package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class IOProperitiesTest {
    public static void main(String[] args) throws IOException {
        //读取文件信息
        FileInputStream fis = new FileInputStream("userinfo.properties");
        //创建一个map集合
        Properties pt = new Properties();
        //将文件中的数据加载到Map集合中
        pt.load(fis);

        String username = pt.getProperty("username");
        System.out.println(username);
        String password = pt.getProperty("password");
        System.out.println(password);

    }
}
