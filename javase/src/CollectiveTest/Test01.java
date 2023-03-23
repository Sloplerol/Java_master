package CollectiveTest;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Collection ce = new ArrayList();
        //内部存放到数据是经过了自动装箱操作变成了一个地址
        ce.add(123);
        ce.add("sdfdsf");
        ce.add(3.24);
        ce.add(new Object());
        ce.add(new Object());


        //统计集合中元素对个数
        System.out.println("集合的个数是"+ce.size());

        ce.clear();
        System.out.println("集合的个数是"+ce.size());


        ce.add("hello");
        ce.add("hello1");
        ce.add("hello2");
        boolean result = ce.contains("hello1");
        System.out.println(result);
        boolean result1 = ce.contains("hello10");
        System.out.println(result1);

        ce.remove("hello");
        boolean result2 = ce.contains("hello");
        System.out.println(result2);

        System.out.println(ce.isEmpty());
        ce.clear();
        System.out.println(ce.isEmpty());

        ce.add(234);
        ce.add(3.13);
        Object[] obj = ce.toArray();
        for(int i = 0;i< obj.length;i++){
            //遍历数组获取里面的对象
            Object o = obj[i];
            System.out.println(o);
        }

    }
}
