package ReflectTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test11 {
    public static void main(String[] args) throws Exception{
        JudgeMila jm = new JudgeMila();
        jm.login("admin",123);

        Class j1 = Class.forName("ReflectTest.JudgeMila");
        Object obj = j1.newInstance();
        //通过方法名和参数列表来获取方法
        Method mt = j1.getDeclaredMethod("login", String.class, int.class);
        //调用方法
        Object reobj = mt.invoke(obj,"admin",123);
        System.out.println(reobj);

    }
}


class JudgeMila{
    public boolean login(String username,int pwd){
        if(username == "admin" && pwd == 123){
            System.out.println("登陆成功");
            return true;
        }
        System.out.println("登陆失败");
        return false;
    }
}
