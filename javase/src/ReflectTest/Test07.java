package ReflectTest;

import java.util.ResourceBundle;

public class Test07 {
    public static void main(String[] args) {
        //资源绑定器 properties文件只能存在于根路径下 路径名不用书写properties
        ResourceBundle rb = ResourceBundle.getBundle("classInfo");
        String username = rb.getString("username");
        System.out.println(username);

        ResourceBundle rb1 = ResourceBundle.getBundle("ReflectTest/className");
        String username1 = rb1.getString("Username");
        System.out.println(username1);

    }
}
