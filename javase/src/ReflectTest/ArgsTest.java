package ReflectTest;

public class ArgsTest {
    public static void main(String[] args) {
        change(1);
        change(1,2);
        change(1,45);
        //args只能出现在最后一位可以出现无数个
        Chan(1,"12344","23434");

        Arrayed("hello","world");
        String[] str = {"a","b","c"};
        Arrayed(str);
    }

    public static void change(int ...args){
        //可变长参数要求参数是0-n个
        System.out.println("hello");
    }

    public static void Chan(int a,String ...args){
        System.out.println("chan");
    }

    public static void Arrayed(String ...args){
        for(int i = 0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
