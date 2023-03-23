package SetTest;

import java.util.HashSet;
import java.util.Set;

public class HashsetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("1");
        set.add("1");
        set.add("4");
        set.add("3");
        set.add("2");
        for(String data : set){
            //HashSet拿到的数据无序且不可以重复
            System.out.println(data);
        }
    }
}
