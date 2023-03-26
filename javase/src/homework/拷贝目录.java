package homework;

import java.io.*;

public class 拷贝目录 {
    public static void main(String[] args) {
        //拷贝的源目录
        File fileScr = new File("/Users/satrol_/sublime_text");
        //拷贝的目标目录
        File fileEnd = new File("/Users/satrol_/copyDir");
        //拷贝操作
        copyDictory(fileScr,fileEnd);

    }
    public static void copyDictory(File fileSrc,File fileEnd){
        //当递归到文件的时候程序将结束
        if(fileSrc.isFile()){
            //对文件的读写操作
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(fileSrc);
                String path = fileEnd.getAbsolutePath() + fileSrc.getAbsolutePath().substring(14);
                fos = new FileOutputStream(path);
                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while((readCount = fis.read(bytes)) != -1){
                    fos.write(bytes,0,readCount);
                }



                fos.flush();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


            return;
        }
        //创建一个文件数组用来存储子文件
        File[] files = fileSrc.listFiles();
        for(File file : files){
            //遍历文件数组如果里面包含目录的话
            if(file.isDirectory()){
                //将该目录的绝对路径进行裁剪
                String scrDir = file.getAbsolutePath();
                //加到目标路径下
                String destDir = fileEnd.getAbsolutePath() + scrDir.substring(14);
                //判断destDir是否存在如果不存在那么就mkdir一个目录
                File newfile = new File(destDir);
                if(!newfile.exists()) {
                    newfile.mkdirs();
                }
            }
            //通过递归操作将所有的文件排除
            copyDictory(file,fileEnd);
        }
    }
}
