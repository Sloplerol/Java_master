package HashMapTest;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(null,123);
        //hashmap的key值可以为空
        System.out.println(map.size()); //1
        map.put(null,34);
        System.out.println(map.size()); //1

    }
}

