package IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws IOException {
        ArrayList<User> user = new ArrayList<User>();
        user.add(new User("zjj",11));
        user.add(new User("ljm",12));
        user.add(new User("laz",13));
        user.add(new User("laz",14));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user"));
        oos.writeObject(user);

    }
}
