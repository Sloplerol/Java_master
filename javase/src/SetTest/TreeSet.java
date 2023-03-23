package SetTest;

import java.util.HashSet;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.TreeSet<>();
        set.add("5");
        set.add("2");
        set.add("1");
        set.add("1");
        set.add("1");
        for(String data : set){
            //TreeSet按照大小排序并且元素不重复
            System.out.println(data);
        }
    }
}
