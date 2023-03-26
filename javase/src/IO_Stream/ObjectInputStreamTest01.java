package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化操作
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();
    }
}
