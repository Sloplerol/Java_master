package IO_Stream;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("hello.txt");
        //File f1 = new File("a/b/c/d");
        if(!f1.exists()){
            //创建文件
            f1.createNewFile();
            //创建目录
            //f1.mkdir();
            //创建多重目录
            //f1.mkdirs();
        }

        File f2 = new File("/Users/satrol_/Documents/组件通信进阶.md");
        //获取父路径
        String parentPath = f2.getParent();
        System.out.println(parentPath);

        File f3 = new File("/Users/satrol_/IJ_Java/parallow.txt");
        //获取绝对路径
        String absolutePath = f3.getAbsolutePath();
        System.out.println(f3);

        //获取文件的名
        System.out.println(f3.getName());

        //判断是否是一个文件
        System.out.println(f3.isFile());

        //判断是否是一个目录
        System.out.println(f3.isDirectory());

        //计算最后一次修改的时间
        long haoMiao = f3.lastModified();
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
        String lastTime = sdf.format(time);
        System.out.println(lastTime);

        //获取文件大小
        System.out.println(f3.length());

    }
}
