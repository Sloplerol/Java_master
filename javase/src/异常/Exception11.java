package 异常;

public class Exception11 {
    public static void main(String[] args) {
        int revlt = result();
        System.out.println(revlt); //10
    }

    public static int result(){
        //遵循自上而下执行
        int a = 10;
        try{
            //return语句最后执行
            return a;
        }finally {
            a++;
        }
    }
}
