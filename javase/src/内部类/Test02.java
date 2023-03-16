package 内部类;

public class Test02 {
    public static void main(String[] args) {
        Mathmax mm = new Mathmax();
        //也可以不通过new实现类来完成
        mm.qiuhe(new achiveinterface(),200,10);
        //通过使用匿名内部类
        //实际上new的并不是Computer接口而是花括号里书写的实现类
        //没有名 不建议使用匿名内部类
//        mm.qiuhe(new Computer(){
//            public int qiuhe(int a,int b){
//                return a+b;
//            }
//        },20,23);
    }
}

interface Computer{
    int sum(int a,int b);
}

class achiveinterface implements Computer{
    public int sum(int a,int b){
        return a+b;
    }
}

class Mathmax{
    public void qiuhe(Computer c,int a,int b){
        int result = c.sum(a,b);
        System.out.println(result);
    }
}
