package homework;

import java.util.Scanner;

public class Exception_home {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        String password = scanner.next();
        Usersevice us = new Usersevice();
        try{
            us.register(username,password);
        }catch (ErrorHandler e){
            e.printStackTrace();
        }
    }

}

class Usersevice {
    public void register(String username,String password) throws ErrorHandler {
        //如果上来不判断username是否为空会出现空指针异常
        if(username == null || username.length() < 6 || username.length() > 14){
            throw new ErrorHandler("输入格式不合法请重新输入");

        }

    }
}