package ListTest;

import java.util.*;

public class VectorTest01 {
    public static void main(String[] args) {
        //Vector扩容两倍
        //初始容量是10
        List a = new Vector();
        a.add(10);
        a.add(10);
        a.add(10);
        a.add(10);


        Iterator it = a.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        List b = new ArrayList();
        //将非线程安全转化成线程安全
        Collections.synchronizedList(b);
        b.add(1);
        b.add(2);
        b.add(3);



    }
}
