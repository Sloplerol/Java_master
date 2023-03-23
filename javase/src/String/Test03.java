package String;

public class Test03 {
    public static void main(String[] args) {
        //查找字符串里单个字符
        System.out.println("sout".charAt(1));

        //compareTo 前-后返回结果
        System.out.println("soub".compareTo("soub")); //0
        System.out.println("soub".compareTo("soua")); //1
        System.out.println("soub".compareTo("souc")); //-1
        System.out.println("abc".compareTo("bac")); //-1 如果第一个比出结果了那么直接返回

        //contains查看是否包含
        System.out.println("abc".contains("a"));

        //endsWith 查看字符是否以什么结尾
        System.out.println("hello.txt".endsWith("txt"));

        //判断两个字符串忽略大小写是否相等
        System.out.println("Hello".equalsIgnoreCase("hello"));

        //将字符串转化成byte数组
        byte[] bytes = "abcdef".getBytes();
        for(int i = 0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }

        //indexOf判断子字符串出现在当前字符串第一个位置的下标索引
        System.out.println("abcabcabc".indexOf("abc")); //0

        //判断某个字符串是否为空
        System.out.println("".isEmpty()); //true
        //判断数组长度为属性length   判断字符串长度为方法length()

        //判断子字符串出现的最后一次索引
        System.out.println("abcabc".lastIndexOf("abc"));

        //replace
        System.out.println("helloworld".replace("hello","no"));

        //split 通过字符进行拆分
        String[] str = "hello-world-a".split("-");
        for(int i = 0;i<str.length;i++){
            System.out.println(str[i]);

        }

        //判断字符串是否以什么开始
        System.out.println("hello,world".startsWith("hello"));

        //截取字符串
        // 参数为1 为起始下标
        System.out.println("sdfdsf".substring(4));
        //参数为2 左闭右开
        System.out.println("helloworld".substring(5,9));

        //toCharArray将字符串转化为char数组
        char[] arr = "我很牛逼啊".toCharArray();
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //将字符串内全部转化成小写
        System.out.println("heSSDFDSFdsfdsf".toLowerCase());
        //将字符串内全部转化成大写
        System.out.println("heSSDFDSFdsfdsf".toUpperCase());

        //去除前后空白
        System.out.println("      hello world     ".trim());

        //静态方法valueOf 将非字符串类型转化成字符串
        String h1 = String.valueOf(2);
        String h2 = String.valueOf('a');
        String h3 = String.valueOf(3.23);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        //当valueof内部传入的是没有重写toString方法对象，那么就会输出对象的内存地址
        String s4 = String.valueOf(new School());
        System.out.println(s4);

        //深究println
        System.out.println(1000);
        //本质上都调用了valueOf方法都转化成了字符串
    }
}

class School{

}
