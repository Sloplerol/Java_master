package CollectiveTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        //向集合内添加元素
        c.add(123);
        c.add(123);
        c.add(123);
        c.add("234");
        //调用集合身上的iterator方法生成迭代器对象,目的是为了去迭代数据的
        Iterator it = c.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
