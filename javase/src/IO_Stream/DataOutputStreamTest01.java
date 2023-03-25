package IO_Stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("m1.txt"));
        boolean a = true;
        byte b = 100;
        char c = '0';
        double d = 100;
        float h = 200;
        int i = 300;
        long l = 400;
        short s = 500;
        //通过数据流方式存储的数据是无法直接查看的需要通过DataInputStream方式进行获取
        dos.writeBoolean(a);
        dos.writeByte(b);
        dos.writeChar(c);
        dos.writeDouble(d);
        dos.writeFloat(h);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeShort(s);
        dos.flush();
    }
}
