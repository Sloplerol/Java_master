package IO_Stream;

import java.io.*;

public class InputStreamReaderTest01 {
    public static void main(String[] args) throws IOException {
        //FileInputStream fs = new FileInputStream("m1.txt");
        //将字节流转化成字符流
        //InputStreamReader isr = new InputStreamReader(fs);
        //将字符流作为节点流传入包装流
        //BufferedReader br = new BufferedReader(isr);
        //将上面三个方法进行合并后的结果
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("m1.txt")));

        String str = null;
        while((str=br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
