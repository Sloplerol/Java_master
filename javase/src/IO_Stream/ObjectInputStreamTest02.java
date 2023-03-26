package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user"));
        List<User> obj = (List<User>)ois.readObject();
        for(User list : obj){
            System.out.println(list);
        }
        System.out.println(obj instanceof List);

    }
}
