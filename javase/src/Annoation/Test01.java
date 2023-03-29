package Annoation;

public class Test01 {
    public static void main(String[] args) {
        //如果给注解定义属性必须要给属性赋值
        @MyAnnoation(name = "zjj",str = {"a","b","c"})
        int a = 10;

        Test01 t = new Test01();
        t.doOther();


    }

    public void doSome(){
        System.out.println("do Some");
    }
    //代表已过时
    @Deprecated
    public void doOther(){
        System.out.println("do Other");
    }

}





