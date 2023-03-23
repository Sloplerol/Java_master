package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception8 {
    public static void main(String[] args) {
        FileInputStream fi = null;
        try{
            //常见输入流对象
            fi = new FileInputStream("/user/ssdf");
            //会出现空指针异常
            String s = null;
            s.toString();
            //关闭流防止占用资源
            //如果放到这里上面出现异常会执行不到
            //fi.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            //finally的代码是一定会执行的
            //如果fi没有new成功可能fi就会出现空指针异常
            if(fi != null){
                try {
                    //close也有异常
                    fi.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
