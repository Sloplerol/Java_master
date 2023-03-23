package String;

public class Test02 {
    public static void main(String[] args) {
        byte[] a1 = {97,98,99};
        //String里面传入byte类型的数组
        String s1 = new String(a1);
//        通过输出结果可以得出String类已经重写了toString方法
        System.out.println(s1);

        String s2 = new String(a1,1,2);
        System.out.println(s2); //bc

        char[] a2 = {'a','b','c'};
        //将字符数组全部转化为字符串
        String s3 = new String(a2);
        System.out.println(s3);
        //将字符数组部分转化为字符串
        String s4 = new String(a2,1,2);
        System.out.println(s4);


    }
}
