package IO_Stream;

import java.io.*;

public class InputStreamReaderTest02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("m1.txt")));
        br.write("helloworld");

        br.flush();

        br.close();

    }
}
