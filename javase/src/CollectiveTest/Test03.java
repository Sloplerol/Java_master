package CollectiveTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        //HashSet内存储的数据是无序不可以重复的
        Collection c = new HashSet();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(10);
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
