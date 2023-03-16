package array;

public class Test04 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("请输入用户名和密码");
            return;
        }
        //书写equal代码的时候应该比避免空指针异常
        /*if(args[0].equals("zhangsan") && args[1].equals("123")){
            System.out.println("登陆成功");
        }else {
            System.out.println("用户核实失败请重新输入");
        }*/
        if("zhangsan".equals(args[0]) && "123".equals(args[1])){
            System.out.println("登陆成功");
        }else {
            System.out.println("用户核实失败请重新输入");
        }
    }
}
