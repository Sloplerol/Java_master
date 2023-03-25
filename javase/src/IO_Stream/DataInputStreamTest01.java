package IO_Stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest01 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("m1.txt"));
        boolean a = dis.readBoolean();
        byte b = dis.readByte();
        char c = dis.readChar();
        double d = dis.readDouble();
        float h = dis.readFloat();
        int i = dis.readInt();
        long l = dis.readLong();
        short s = dis.readShort();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(h);
        System.out.println(i);
        System.out.println(l);
        System.out.println(s);

        dis.close();
    }
}
