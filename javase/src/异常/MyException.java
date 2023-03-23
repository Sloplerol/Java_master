package 异常;

public class MyException extends Exception{
    //编写编译时异常就继承编译式
    public MyException(){

    }

    public MyException(String str){
        System.out.println(str);
    }
}
//public class MyException extends RuntimeException{}


