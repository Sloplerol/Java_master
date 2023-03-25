package IO_Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("m1.txt");
        //当某一个流的构造方法里面传入流 那么称这个流为节点流
        //外部负责包装的这个流叫做包装流
        //在这里fr被称为节点流，br被称为包装流
        BufferedReader br = new BufferedReader(fr);

//        String firstline = br.readLine();
//
//        System.out.println(firstline);
        String s = null;
        //当包转流读不到内容的时候返回结果为null
        while((s = br.readLine()) != null){
            System.out.println(s);
        }

        //只需要将包装流进行关闭即可，里面的流自动关闭
        br.close();
    }
}
