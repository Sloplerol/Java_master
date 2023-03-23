package 异常;

public class Exception9 {
    public static void main(String[] args) {
        //try不能单独使用
        //try和finally可以联合使用
        try{
            System.out.println("try");
            return;
        }finally {
            System.out.println("finally");
        }
        //执行顺序为try finally return
        //finally下的语句是无法执行的

    }
}
