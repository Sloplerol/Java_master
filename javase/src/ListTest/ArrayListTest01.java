package ListTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {
        //ArrayList的默认初始容量是10
        List ls = new ArrayList();
        //size获取到到是集合中元素到个数而不是集合的容量
        System.out.println(ls.size());

        List ls1 = new ArrayList(20);
        System.out.println(ls.size());
        //ArrayList每次扩容1.5

        //将10的二进制为右移一位
        System.out.println(10 >> 1);
    }
}
