package HashMapTest;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
        //Hashtable的key值是不能为空的
        //map.put(null,234);
        //Hashtable的value值也不能为空
        map.put(123,null);
    }
}
