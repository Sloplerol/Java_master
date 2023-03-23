package CollectiveTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test07 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //Iterator it = c.iterator();
        //集合的结构如果发生了变化的话，需要获取新的迭代器
        c.add(2);
        c.add("sdf");
        c.add(new Object());
        Iterator it1 = c.iterator();
        while(it1.hasNext()){
            //迭代器迭代的每一项都是对象
            Object obj = it1.next();
            //通过集合来删除元素并没有通知迭代器
            //c.remove();
            //使用迭代器删除会自动更新迭代器
            it1.remove();
            System.out.println(obj);
        }
    }
}
