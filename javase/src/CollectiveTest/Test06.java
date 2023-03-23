package CollectiveTest;

import java.util.ArrayList;
import java.util.Collection;

public class Test06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("123");
        String s2 = new String("123");
        c.add(s1);
        //s1等价于s2，删除s2，s1就会消失
        c.remove(s2);
        System.out.println(c.size());
    }
}
