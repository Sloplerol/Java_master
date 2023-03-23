package ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(1);
        l.add(1);
        l.add(1);
        l.add("hello");

        l.add(1,"hello");
        Iterator it = l.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        //get获取元素
        System.out.println(l.get(1));
        for(int i = 0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        //获取对象第一次的下标索引
        System.out.println(l.indexOf("hello"));

        //获取对象最后一次的索引
        System.out.println(l.lastIndexOf("hello"));

        //删除指定下标的元素
        System.out.println(l.remove(4));

        //修改指定下标元素
        l.set(1,"wc");
        for(int i = 0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
