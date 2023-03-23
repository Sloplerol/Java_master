package CollectiveTest;

import java.util.ArrayList;
import java.util.Collection;

public class Test04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String x1 = new String("abc");
        c.add(x1);
        String x2 = new String("bcd");
        c.add(x1);
        String x3 = new String("abc");
        c.add(x1);
        //contains底层调用了equals方法来进行比对
        System.out.println(c.contains(x3));

    }
}
