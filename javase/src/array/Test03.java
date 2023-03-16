package array;

public class Test03 {
    public static void main(String[] args) {
        //String定义的数组默认值为null但是在这里却为0
        //main方法是用来接收用户输入的数据的 args里面存放的就是java进来的数据
        System.out.println("JVM传过来的数组长度为"+args.length); //0
        for(int i = 0;i< args.length;i++){
            System.out.println(args[i]);
        }
    }

    public static void getArrlength(String[] args){
        System.out.println(args.length);
    }
}
